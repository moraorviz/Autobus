package com.mario.modelo;

import java.sql.Date;
import java.sql.Time;


public class Horario {
	
	public Horario(int horarioId, int estacionSalidaId, int estacionLlegadaId, Date fechaSalida, Date fechaLlegada,
			Time horaSalida, Time horaLlegada) {
		super();
		this.horarioId = horarioId;
		this.estacionSalidaId = estacionSalidaId;
		this.estacionLlegadaId = estacionLlegadaId;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}
	public Horario() {
		// TODO Auto-generated constructor stub
	}
	private int horarioId;
	private int estacionSalidaId;
	private int estacionLlegadaId;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Time horaSalida;
	private Time horaLlegada;
	private String estacionSalidaNombre;
	private String estacionLlegadaNombre;
	
	public int getHorarioId() {
		return horarioId;
	}
	public Horario(int estacionSalidaId, int estacionLlegadaId, Date fechaSalida, Date fechaLlegada, Time horaSalida,
			Time horaLlegada) {
		super();
		this.estacionSalidaId = estacionSalidaId;
		this.estacionLlegadaId = estacionLlegadaId;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}
	public void setHorarioId(int horarioId) {
		this.horarioId = horarioId;
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
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Time getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Time getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(Time horaLlegada) {
		this.horaLlegada = horaLlegada;
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
	@Override
	public String toString() {
		return "Horario [horarioId=" + horarioId + ", estacionSalidaId=" + estacionSalidaId + ", estacionLlegadaId="
				+ estacionLlegadaId + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada
				+ ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + "]";
	}
	
}
