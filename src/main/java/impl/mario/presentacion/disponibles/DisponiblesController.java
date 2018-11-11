package impl.mario.presentacion.disponibles;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Condicion;
import com.mario.modelo.Family;
import com.mario.modelo.Horario;
import com.mario.negocio.BilleteRegistroManagerService;

@Controller
@SessionAttributes("billeteRegistro")
public class DisponiblesController {
	
	@Autowired
	BilleteRegistroManagerService billeteRegistroManagerService;

	public BilleteRegistroManagerService getBilleteRegistroManagerService() {
		return billeteRegistroManagerService;
	}
	
	@RequestMapping(value="trayectosDisponibles", method=RequestMethod.GET)
	public String getMostrarDisponibles(Model model, BilleteRegistro billeteRegistro) throws Exception
	{
		System.out.println("Ejecutando el m�todo GET de la vista de mostrar los billetes disponibles");
		Time timeSalida = Time.valueOf("15:00:00");
		Time timeLlegada = Time.valueOf("20:00:00");
		Time timeMadrugada = Time.valueOf("04:00:00");
		Vector<Horario> disponibles = billeteRegistroManagerService.getDisponibles(billeteRegistro);
		
		if (disponibles.size()==0) {
			disponibles.addElement(new Horario(billeteRegistro.getEstacionSalidaId(), billeteRegistro.getEstacionLlegadaId(), billeteRegistro.getFechaSalida(), 
					billeteRegistro.getFechaSalida(), timeSalida,	timeLlegada, getNombreEstacion(billeteRegistro.getEstacionSalidaId()), getNombreEstacion(billeteRegistro.getEstacionSalidaId())));
			disponibles.addElement(new Horario(billeteRegistro.getEstacionSalidaId(), billeteRegistro.getEstacionLlegadaId(), billeteRegistro.getFechaSalida(), 
					billeteRegistro.getFechaSalida(), timeLlegada,	timeMadrugada, getNombreEstacion(billeteRegistro.getEstacionSalidaId()), getNombreEstacion(billeteRegistro.getEstacionSalidaId())));
		}
		
		for (Horario horario : disponibles) {
			horario.setEstacionSalidaNombre(getNombreEstacion(horario.getEstacionSalidaId()));
			horario.setEstacionLlegadaNombre(getNombreEstacion(horario.getEstacionLlegadaId()));
			System.out.println(horario.toString());
		}
		
		model.addAttribute("disponibles", disponibles);
		return "trayectosDisponibles";
	}
	
	private String getNombreEstacion(int estacionId) throws Exception
	{
		HashMap<Integer, String> estaciones = new HashMap<Integer, String>();
		estaciones.put(1, "Madrid");
		estaciones.put(2, "Barcelona");
		estaciones.put(3, "Valencia");
		estaciones.put(4, "Sevilla");
		estaciones.put(5, "Zaragoza");
		estaciones.put(6, "Malaga");
		estaciones.put(7, "Murcia");
		estaciones.put(8, "Palma");
		estaciones.put(9, "Las Palmas de Gran Canaria");
		estaciones.put(10, "Bilbao");
		
		return estaciones.get(estacionId);
	}

}
