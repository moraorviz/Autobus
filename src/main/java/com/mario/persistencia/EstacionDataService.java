package com.mario.persistencia;

import java.util.Vector;

import com.mario.modelo.Estacion;

public interface EstacionDataService {

	public Vector<Estacion> getEstaciones() throws Exception;
		
}
