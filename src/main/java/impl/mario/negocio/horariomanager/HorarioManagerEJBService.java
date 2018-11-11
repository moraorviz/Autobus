package impl.mario.negocio.horariomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.Horario;
import com.mario.negocio.HorarioManagerService;


public class HorarioManagerEJBService implements HorarioManagerService {
	
	@Autowired
	private HorarioManager horarioManager = null;

	public void setEstacionManager(HorarioManager horarioManager) {
		System.out.println("Estableciendo la referencia a horarioManager");
		this.horarioManager = horarioManager;
	}
	
	@Override
	public Vector<Horario> getHorarios() throws Exception {
		System.out.println("HorarioManagerEJBService.getHorarios();");
		return horarioManager.getHorarios();
	}

	@Override
	public void setHorario(Horario horario) throws Exception {
		// TODO Auto-generated method stub
		horarioManager.setHorario(horario);
	}
	
}
