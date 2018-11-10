package com.mario.negocio;

import java.util.Vector;

import com.mario.modelo.Estacion;


public interface EstacionManagerService {
	
	public Vector<Estacion> getEstaciones() throws Exception;

}
