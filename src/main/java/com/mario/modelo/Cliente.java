package com.mario.modelo;

public class Cliente {
	
	private int clienteId;
	private String nombre;
	private String primerAppelido;
	private String segundoApellido;
	private String numeroIdentidad;
	private String correo;
	
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerAppelido() {
		return primerAppelido;
	}
	public void setPrimerAppelido(String primerAppelido) {
		this.primerAppelido = primerAppelido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
