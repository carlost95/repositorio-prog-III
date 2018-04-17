package logica;

import java.sql.Date;
import java.util.ArrayList;

public class Vuelo {
	private String codigoVuelo;
	private Aeropuerto salida;
	private Date fechaHoraSalida;
	private Aeropuerto arribo;
	private Date fechaHoraArribo;
	private Aerolinea aerolinea;
	private  ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	private Avion avion;
	private  ArrayList<Asignacion> pasajeros = new ArrayList<Asignacion>();
	public Vuelo(String codigoVuelo, Aeropuerto salida, Date fechaHoraSalida, Aeropuerto arribo, Date fechaHoraArribo,
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
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public Date getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(Date fechaHoraArribo) {
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
		return "Vuelo [codigoVuelo=" + codigoVuelo + ", salida=" + salida + ", fechaHoraSalida=" + fechaHoraSalida
				+ ", arribo=" + arribo + ", fechaHoraArribo=" + fechaHoraArribo + ", aerolinea=" + aerolinea
				+ ", pilotos=" + pilotos + ", avion=" + avion + ", pasajeros=" + pasajeros + "]";
	}
	
	
}
