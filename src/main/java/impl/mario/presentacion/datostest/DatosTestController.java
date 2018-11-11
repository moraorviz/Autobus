package impl.mario.presentacion.datostest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mario.modelo.Horario;
import com.mario.negocio.HorarioManagerService;



@Controller
public class DatosTestController {
	
	@Autowired
	HorarioManagerService horarioManagerService;

	public HorarioManagerService getBookManagerService() {
		return horarioManagerService;
	}
	
	@RequestMapping("/insertarDatosTest")
	public String insertarDatosdeTest() throws Exception {
		System.out.println("Ejecutando el controlador de /insertarDatosTest");
		ArrayList<Horario> horariosArray = horarioManagerService.generarDatosTest();
		for (Horario horario: horariosArray) {
			horarioManagerService.setHorario(horario);
		}
		return "private/insertarDatosTest";
	}
}
