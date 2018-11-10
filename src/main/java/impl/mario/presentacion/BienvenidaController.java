package impl.mario.presentacion;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class BienvenidaController {

	/*
	 * Setting / as request mapping url we are setting the default controller for
	 * the application.
	 */
	@RequestMapping("/")
	public String bienvenida() {
		System.out.println("Ejecutando controlador de bienvenida");
		return "redirect:/menu";
	}

	@RequestMapping("/menu")
	public String index() {
		System.out.println("Ejecutando el controlador de /menu para visitante");
		return "indice";
	}

}

