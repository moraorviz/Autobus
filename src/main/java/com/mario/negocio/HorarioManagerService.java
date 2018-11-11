package com.mario.negocio;

import java.util.Vector;

import com.mario.modelo.Horario;

public interface HorarioManagerService {
	
	public Vector<Horario> getHorarios() throws Exception;
	
	public void setHorario(Horario horario) throws Exception;

}
