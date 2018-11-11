package com.mario.modelo;

public class BilleteRegistro {

	private int billeteRegistroId;
	private Estacion estacionSalida;
	private Estacion estacionLlegada;
	private Horario horario;
	private boolean idaYvuelta;
	
	public int getBilleteRegistroId() {
		return billeteRegistroId;
	}
	public void setBilleteRegistroId(int billeteRegistroId) {
		this.billeteRegistroId = billeteRegistroId;
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
	
	@Override
	public String toString() {
		return "BilleteRegistro [estacionSalida=" + estacionSalida + ", estacionLlegada=" + estacionLlegada + 
				", horario=" + horario + ", idaYvuelta=" + idaYvuelta + "]";
	}
	
}
