package impl.mario.presentacion.sacarbillete;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mario.negocio.EstacionManagerService;
import com.mario.modelo.Family;

@Controller

public class SacarBilleteController {
	
	@Autowired
	private EstacionManagerService estacionManagerService;

	public EstacionManagerService getEstacionManagerService() {
		return estacionManagerService;
	}

	public void setEstacionManagerService(EstacionManagerService estacionManagerService) {
		this.estacionManagerService = estacionManagerService;
	}
	
	@RequestMapping("/sacarBillete")
	public String sacarBillete() throws Exception {
		System.out.println("Ejecutando SacarBillete.");

		return "sacarBillete";
		
	}
	
}
