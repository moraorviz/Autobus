package com.mario.modelo;

public class BilleteRegistro {

	private int billeteRegistroId;
	private int estacionSalidaId;
	private int estacionLlegadaId;
	private Estacion estacionSalida;
	private Estacion estacionLlegada;
	private Horario horario;
	private String codigoTipoRegistro;
	private boolean idaYvuelta;
	private int numeroPasajeros;
	
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
	@Override
	public String toString() {
		return "BilleteRegistro [estacionSalidaId=" + estacionSalidaId + ", estacionLlegadaId=" + estacionLlegadaId + 
				", horario=" + horario.getFechaSalida() + ", idaYvuelta=" + idaYvuelta + ", numeroPasajeros=" + numeroPasajeros + "]";
	}

	
}
