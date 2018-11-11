package impl.mario.presentacion.sacarbillete;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mario.negocio.EstacionManagerService;
import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Estacion;
import com.mario.modelo.Family;

@Controller
@SessionAttributes("shoppingCart")
public class SacarBilleteController {
	
	@Autowired
	private EstacionManagerService estacionManagerService;

	public EstacionManagerService getEstacionManagerService() {
		return estacionManagerService;
	}

	public void setEstacionManagerService(EstacionManagerService estacionManagerService) {
		this.estacionManagerService = estacionManagerService;
	}
	
	@RequestMapping(value="sacarBillete", method=RequestMethod.GET)
	public String getSB(Model model) throws Exception
	{
		System.out.println("Ejecutando el método GET");

		model.addAttribute("listaEstaciones", estacionManagerService.getEstaciones());
		model.addAttribute("billeteRegistro", new BilleteRegistro());
		return "sacarBillete";
	}
	
}
