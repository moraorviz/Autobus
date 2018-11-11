package com.mario.persistencia;

import java.util.Vector;
import com.mario.modelo.Horario;

public interface HorarioDataService {

	public Vector<Horario> getHorarios() throws Exception;
	
	public void setHorario(Horario horario) throws Exception;
	
}
