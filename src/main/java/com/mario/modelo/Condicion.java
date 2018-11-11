package com.mario.modelo;

public class Condicion {
	
	private boolean estado;
	private String descripcion;
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Condicion(boolean estado, String descripcion) {
		super();
		this.estado = estado;
		this.descripcion = descripcion;
	}

}
