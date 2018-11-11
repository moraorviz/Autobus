package impl.mario.presentacion.disponibles;

import java.util.ArrayList;
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
		System.out.println("Ejecutando el método GET de la vista de mostrar los billetes disponibles");
		if (billeteRegistro==null) {
			System.out.println("billeteRegistro es null");
		}
		Vector<Horario> disponibles = billeteRegistroManagerService.getDisponibles(billeteRegistro);
		for (Horario horario : disponibles) {
			System.out.println(horario.toString());
		}
		model.addAttribute("disponibles", disponibles);
		return "trayectosDisponibles";
	}

}
