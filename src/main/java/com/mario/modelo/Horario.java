package com.mario.modelo;

import java.sql.Date;
import java.sql.Time;


public class Horario {
	
	private int horarioId;
	private Estacion estacionSalida;
	private Estacion estacionLlegada;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Time horaSalida;
	private Time horaLlegada;
	
	public int getHorarioId() {
		return horarioId;
	}
	public void setHorarioId(int horarioId) {
		this.horarioId = horarioId;
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

}
