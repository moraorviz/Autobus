package impl.mario.negocio.estacionmanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.Estacion;
import com.mario.negocio.EstacionManagerService;
import com.mario.persistencia.EstacionDataService;


public class EstacionManager implements EstacionManagerService {
	
	@Autowired
	private EstacionDataService estacionDataService = null;

	public void setEstacionDataService(EstacionDataService estacionDataService) {
		System.out.println("Estableciendo la bean de estacionDataService");
		this.estacionDataService = estacionDataService;
	}
	
	public Vector<Estacion> getEstaciones() throws Exception {
		
		Vector<Estacion> estaciones = estacionDataService.getEstaciones();
		return estaciones;
	}
	

}
