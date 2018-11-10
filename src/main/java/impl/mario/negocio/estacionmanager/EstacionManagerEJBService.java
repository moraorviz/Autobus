package impl.mario.negocio.estacionmanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.Estacion;
import com.mario.negocio.EstacionManagerService;

public class EstacionManagerEJBService implements EstacionManagerService {
	
	@Autowired
	private EstacionManager estacionManager = null;

	public void setEstacionManager(EstacionManager estacionManager) {
		System.out.println("Estableciendo la referencia a estacionManager");
		this.estacionManager = estacionManager;
	}
	
	public Vector<Estacion> getEstaciones() throws Exception {
		
		System.out.println("EstacionManagerEJBService.getEstaciones();");
		return estacionManager.getEstaciones();
	}

}
