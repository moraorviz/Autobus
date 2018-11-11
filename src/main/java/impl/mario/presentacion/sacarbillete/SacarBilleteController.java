package impl.mario.presentacion.sacarbillete;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mario.negocio.EstacionManagerService;
import com.mario.negocio.HorarioManagerService;
import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Condicion;
import com.mario.modelo.Estacion;
import com.mario.modelo.Family;

@Controller
public class SacarBilleteController {
	
	@Autowired
	private EstacionManagerService estacionManagerService;
	
	@Autowired
	private HorarioManagerService horarioManagerService;

	public EstacionManagerService getEstacionManagerService() {
		return estacionManagerService;
	}

	public void setEstacionManagerService(EstacionManagerService estacionManagerService) {
		this.estacionManagerService = estacionManagerService;
	}
	
	public HorarioManagerService getHorarioManagerService() {
		return horarioManagerService;
	}

	public void setHorarioManagerService(HorarioManagerService horarioManagerService) {
		this.horarioManagerService = horarioManagerService;
	}

	@RequestMapping(value="sacarBillete", method=RequestMethod.GET)
	public String getSacarBillete(Model model) throws Exception
	{
		System.out.println("Ejecutando el método GET de la vista de sacar los billetes");
		ArrayList<Condicion> condiciones = new ArrayList<Condicion>();
		ArrayList<Family> families = new ArrayList<Family>();
		
		families.add(new Family(1, "Un pasajero"));
		families.add(new Family(2, "Dos pasajeros"));
		families.add(new Family(3, "Tres pasajeros"));
		families.add(new Family(4, "Cuatro pasajeros"));
		condiciones.add(new Condicion(false, "Solo ida"));
		condiciones.add(new Condicion(true, "Ida y Vuelta"));
		
		model.addAttribute("families", families);
		model.addAttribute("condiciones", condiciones);
		model.addAttribute("listaEstaciones", estacionManagerService.getEstaciones());
		model.addAttribute("listaHorarios", horarioManagerService.getHorarios());
		model.addAttribute("billeteRegistro", new BilleteRegistro());
		System.out.println("returning sacarBillete view");
		return "sacarBillete";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newBook(@ModelAttribute BilleteRegistro billeteRegistro) 
	{

		try {
			System.out.println("Ejecutando el metodo POST");
			System.out.println(billeteRegistro.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:sacarBillete";
	}

	
}
