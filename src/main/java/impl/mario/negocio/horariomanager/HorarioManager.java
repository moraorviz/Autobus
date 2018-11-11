package impl.mario.negocio.horariomanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.Horario;
import com.mario.negocio.HorarioManagerService;
import com.mario.persistencia.HorarioDataService;

public class HorarioManager implements HorarioManagerService {
	
	@Autowired
	private HorarioDataService horarioDataService = null;

	public void setHorarioDataService(HorarioDataService horarioDataService) {
		System.out.println("Estableciendo la bean del horarioDataService");
		this.horarioDataService = horarioDataService;
	}

	@Override
	public Vector<Horario> getHorarios() throws Exception {
		Vector<Horario> horarios = horarioDataService.getHorarios();
		return horarios;
	}

	@Override
	public void setHorario(Horario horario) throws Exception {
		this.horarioDataService.setHorario(horario);
	}
	
	

}
