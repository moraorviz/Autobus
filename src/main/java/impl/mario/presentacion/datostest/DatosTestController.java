package impl.mario.presentacion.datostest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatosTestController {
	
	@RequestMapping("/insertarDatosTest")
	public String index() {
		System.out.println("Ejecutando el controlador de /insertarDatosTest");
		return "private/insertarDatosTest";
	}
}
