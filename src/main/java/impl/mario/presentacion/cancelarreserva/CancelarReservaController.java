package impl.mario.presentacion.cancelarreserva;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CancelarReservaController {
	
	@RequestMapping(value="cancelarReserva", method=RequestMethod.GET)
	public String cancelarReserva() {
		System.out.println("Ejecutando el controlador de /cancelarReserva para visitante");
		return "cancelarReserva";
	}

}
