package impl.mario.presentacion.disponibles;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

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
@SessionAttributes( {"billeteRegistro", "vueltas", "disponibles" })
public class DisponiblesController {

	@Autowired
	BilleteRegistroManagerService billeteRegistroManagerService;

	public BilleteRegistroManagerService getBilleteRegistroManagerService() {
		return billeteRegistroManagerService;
	}

	@RequestMapping(value = "trayectosDisponibles", method = RequestMethod.GET)
	public String getMostrarDisponibles(Model model, BilleteRegistro billeteRegistro) throws Exception {
		System.out.println("Ejecutando el método GET de la vista de mostrar los billetes disponibles");
		Time timeSalida = Time.valueOf("15:00:00");
		Time timeLlegada = Time.valueOf("20:00:00");
		Time timeMadrugada = Time.valueOf("04:00:00");
		Vector<Horario> disponibles = billeteRegistroManagerService.getDisponibles(billeteRegistro);
		ArrayList<Horario> vueltas = generarViajeRegreso(billeteRegistro.getEstacionLlegadaId(), billeteRegistro.getEstacionSalidaId(), billeteRegistro.getFechaSalida());

		if (disponibles.size() == 0) {
			disponibles.addElement(
					new Horario(billeteRegistro.getEstacionSalidaId(), billeteRegistro.getEstacionLlegadaId(),
							billeteRegistro.getFechaSalida(), billeteRegistro.getFechaSalida(), timeSalida, timeLlegada,
							getNombreEstacion(billeteRegistro.getEstacionSalidaId()),
							getNombreEstacion(billeteRegistro.getEstacionSalidaId())));
			disponibles.addElement(
					new Horario(billeteRegistro.getEstacionSalidaId(), billeteRegistro.getEstacionLlegadaId(),
							billeteRegistro.getFechaSalida(), billeteRegistro.getFechaSalida(), timeLlegada,
							timeMadrugada, getNombreEstacion(billeteRegistro.getEstacionSalidaId()),
							getNombreEstacion(billeteRegistro.getEstacionSalidaId())));
		}

		for (Horario horario : disponibles) {
			horario.setEstacionSalidaNombre(getNombreEstacion(horario.getEstacionSalidaId()));
			horario.setEstacionLlegadaNombre(getNombreEstacion(horario.getEstacionLlegadaId()));
			System.out.println(horario.toString());
		}
		
		model.addAttribute("vueltas", vueltas);
		model.addAttribute("disponibles", disponibles);
		return "trayectosDisponibles";
	}
	
	@RequestMapping(value = "imprimirDisponibles", method = RequestMethod.GET)
	public String postImprimirDisponibles(Model model, BilleteRegistro billeteRegistro) throws Exception {
		System.out.println("Ejecutando el metodo GET");
		return "imprimirDisponibles";
	}

	private String getNombreEstacion(int estacionId) throws Exception {
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

	public ArrayList<Horario> generarViajeRegreso(int estacionSalidaId, int estacionLlegadaId, Date fechaSalida) throws Exception {

		long minDay = fechaSalida.toLocalDate().toEpochDay();
		long maxDay = LocalDate.of(2018, 12, 31).toEpochDay();
		long randomDay;
		LocalDate randomDate;
		Date date;
		Time horaSalida = Time.valueOf("15:00:00");
		Time horaLlegada = Time.valueOf("20:00:00");
		ArrayList<Horario> vueltas = new ArrayList<Horario>();

		for (int i = 0; i < 2; i++) {
			randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
			randomDate = LocalDate.ofEpochDay(randomDay);
			date = Date.valueOf(randomDate);

			vueltas.add(new Horario(estacionSalidaId, estacionLlegadaId,
					date, date, horaSalida,
					horaLlegada, getNombreEstacion(estacionSalidaId),
					getNombreEstacion(estacionLlegadaId)));
					
		}

		return vueltas;
	}

	public static int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
		int random = start + rnd.nextInt(end - start + 1 - exclude.length);
		for (int ex : exclude) {
			if (random < ex) {
				break;
			}
			random++;
		}
		return random;
	}

}
