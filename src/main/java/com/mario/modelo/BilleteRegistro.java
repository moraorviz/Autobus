package com.mario.modelo;

public class BilleteRegistro {

	private int billeteRegistroId;
	private int estacionSalidaId;
	private int estacionLlegadaId;
	private Estacion estacionSalida;
	private Estacion estacionLlegada;
	private Horario horario;
	private String codigoTipoRegistro;
	private boolean soloIda;
	public boolean idaYvuelta;
	
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
	public boolean isSoloIda() {
		return soloIda;
	}
	public void setSoloIda(boolean soloIda) {
		this.soloIda = soloIda;
	}
	
	public String getCodigoTipoRegistro() {
		return codigoTipoRegistro;
	}
	public void setCodigoTipoRegistro(String codigoTipoRegistro) {
		this.codigoTipoRegistro = codigoTipoRegistro;
	}
	@Override
	public String toString() {
		return "BilleteRegistro [estacionSalida=" + estacionSalida + ", estacionLlegada=" + estacionLlegada + 
				", horario=" + horario + ", idaYvuelta=" + idaYvuelta + "]";
	}

	
}
