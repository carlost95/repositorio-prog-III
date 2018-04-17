package logica;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo {
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private  ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	private Avion avion;
	private  ArrayList<Asignacion> pasajeros = new ArrayList<Asignacion>();
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo, LocalDateTime fechaHoraArribo,
			Aerolinea aerolinea, ArrayList<Piloto> pilotos, Avion avion, ArrayList<Asignacion> pasajeros) {
		super();
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public ArrayList<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(ArrayList<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}
	@Override
	public String toString() {
		return "Vuelo " + codigoVuelo +" "+ salida +" "+  fechaHoraSalida +" "+ arribo +" "+ fechaHoraArribo  +" "+ aerolinea
				 +" "+ pilotos +" "+  avion +" "+  pasajeros;
	}
	
	
}
