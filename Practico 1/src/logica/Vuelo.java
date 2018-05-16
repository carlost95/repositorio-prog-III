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
	private  ArrayList<Piloto> pilotos;
	private Avion avion;
	private  ArrayList<Asignacion> pasajeros;
	private int duracionVuelo;
	
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
	public String mostrarDetalleAsignacion(){
		System.out.println("Detalle de Asignaciones - Vuelo "+ codigoVuelo);
		
		for (Asiento asiento  : avion.getListaasiento()) {
			
			int senial=0;
			
			for (Asignacion asignacion : pasajeros) {
				
				if (asiento.getIdAsiento()== asignacion.getAsiento().getIdAsiento()){
					senial=1;
					System.out.println("Asiento "+ asiento.getNumeroAsiento() + " - Ocupado");
					break;
				}
				else {
					senial=0;
				}
			}
			if (senial==0) 
				System.out.println("Asiento "+ asiento.getNumeroAsiento() +" - Libre");
		}
		return "";
	}
	private void pasarHoras() {

		if(fechaHoraArribo.getHour() > fechaHoraSalida.getHour()) {
				duracionVuelo = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())*60) +
						(fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
				avion.contadorHorasVuelo(duracionVuelo);
				}
		
		else {
				duracionVuelo = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())*60) -
						(fechaHoraSalida.getMinute() - fechaHoraArribo.getMinute());
				avion.contadorHorasVuelo(duracionVuelo);
				}
	for (Piloto piloto : pilotos) {
		piloto.contadorHorasVuelo(duracionVuelo);
	}
	}
	
	public String mostrarDetalleVuelo (){
		pasarHoras();
		return ("Vuelo "+ codigoVuelo +" - "+ avion.getModelo() +" "+avion.getMatricula()+'\n'+
		fechaHoraSalida.getDayOfWeek()+" "+fechaHoraSalida.getDayOfMonth()+" de "+fechaHoraSalida.getMonth()+" "+
		fechaHoraSalida.getHour()+":"+fechaHoraSalida.getMinute()+" "+salida.getCodigo()+" ("+salida.getCiudad().getNombre()+" - "+salida.getNombre()+")"+'\n'+
		fechaHoraArribo.getDayOfWeek()+" "+ fechaHoraArribo.getDayOfMonth()+" de "+ fechaHoraArribo.getMonth()+" "+
		fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+" "+arribo.getCodigo()+" ("+arribo.getCiudad().getNombre()+" - "+arribo.getNombre()+")"+'\n'+
		"Operado por "+aerolinea.getNombre() +" Duración "+duracionVuelo/60+"h "+duracionVuelo%60+"m");
		
	}
	
	
}
