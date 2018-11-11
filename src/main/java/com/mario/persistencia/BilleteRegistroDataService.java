package com.mario.persistencia;

import java.util.Vector;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Horario;

public interface BilleteRegistroDataService {
	
	public Vector<BilleteRegistro> getBilleteRegistros() throws Exception;
	
	public void setBilleteRegistro(BilleteRegistro billeteRegistro) throws Exception;
	
	public Vector<Horario> getDisponibles(BilleteRegistro billeteRegistro) throws Exception;

}
