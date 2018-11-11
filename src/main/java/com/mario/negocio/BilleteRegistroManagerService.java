package com.mario.negocio;

import java.util.Vector;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Horario;


public interface BilleteRegistroManagerService {
	
	public Vector<BilleteRegistro> getBilleteRegistros() throws Exception;
	
	public void setBilleteRegistro(BilleteRegistro billeteRegistro) throws Exception;
	
	public Vector<Horario> getDisponibles(BilleteRegistro billeteRegistro) throws Exception;

}
