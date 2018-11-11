package com.mario.modelo;

import java.sql.Date;

public class BilleteRegistro {

	private int billeteRegistroId;
	private int estacionSalidaId;
	private int estacionLlegadaId;
	private String estacionSalidaNombre;
	private String estacionLlegadaNombre;
	private Estacion estacionSalida;
	private Estacion estacionLlegada;
	private Horario horario;
	private String codigoTipoRegistro;
	private boolean idaYvuelta;
	private int numeroPasajeros;
	private Date fechaSalida;
	
	public int getBilleteRegistroId() {
		return billeteRegistroId;
	}
	public void setBilleteRegistroId(int billeteRegistroId) {
		this.billeteRegistroId = billeteRegistroId;
	}
	public int getEstacionSalidaId() {
		return estacionSalidaId;
	}
	public void setEstacionSalidaId(int estacionSalidaId) {
		this.estacionSalidaId = estacionSalidaId;
	}
	public int getEstacionLlegadaId() {
		return estacionLlegadaId;
	}
	public void setEstacionLlegadaId(int estacionLlegadaId) {
		this.estacionLlegadaId = estacionLlegadaId;
	}
	public Estacion getEstacionSalida() {
		return estacionSalida;
	}
	public void setEstacionSalida(Estacion estacionSalida) {
		this.estacionSalida = estacionSalida;
	}
	public Estacion getEstacionLlegada() {
		return estacionLlegada;
	}
	public void setEstacionLlegada(Estacion estacionLlegada) {
		this.estacionLlegada = estacionLlegada;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public boolean isIdaYvuelta() {
		return idaYvuelta;
	}
	public void setIdaYvuelta(boolean idaYvuelta) {
		this.idaYvuelta = idaYvuelta;
	}
	
	public String getCodigoTipoRegistro() {
		return codigoTipoRegistro;
	}
	public void setCodigoTipoRegistro(String codigoTipoRegistro) {
		this.codigoTipoRegistro = codigoTipoRegistro;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public String getEstacionSalidaNombre() {
		return estacionSalidaNombre;
	}
	public void setEstacionSalidaNombre(String estacionSalidaNombre) {
		this.estacionSalidaNombre = estacionSalidaNombre;
	}
	public String getEstacionLlegadaNombre() {
		return estacionLlegadaNombre;
	}
	public void setEstacionLlegadaNombre(String estacionLlegadaNombre) {
		this.estacionLlegadaNombre = estacionLlegadaNombre;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	@Override
	public String toString() {
		return "BilleteRegistro [estacionSalidaId=" + estacionSalidaId + ", estacionLlegadaId=" + estacionLlegadaId + 
				", horario=" + fechaSalida + ", idaYvuelta=" + idaYvuelta + ", numeroPasajeros=" + numeroPasajeros + "]";
	}

	
}
