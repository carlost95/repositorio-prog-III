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
	private  ArrayList<Asignacion> pasajeros1;
	
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
		this.pasajeros1 = pasajeros;

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
		return pasajeros1;
	}
	public void setPasajeros(ArrayList<Asignacion> pasajeros) {
		this.pasajeros1 = pasajeros;
	}
	public int  duracionHoras(int hora1, int hora2){
		int horas = hora2- hora1;
		return horas;
		
	}
	public int  duracionMinutos(int min1,int min2){
		int minutos= min2 - min1;
		return minutos	;
	}
	public String mostrarDetalleVuelo (){
		int horas = duracionHoras(fechaHoraSalida.getHour(),fechaHoraArribo.getHour()); 
		int minutos = duracionMinutos(fechaHoraSalida.getMinute(),fechaHoraArribo.getMinute());
		
		
		return ("Vuelo "+ codigoVuelo +"-"+ avion.getModelo() +" "+avion.getMatricula()+'\n'+
		fechaHoraSalida.getDayOfWeek()+" "+fechaHoraSalida.getDayOfMonth()+" de "+fechaHoraSalida.getMonth()+" "+
		fechaHoraSalida.getHour()+":"+fechaHoraSalida.getMinute()+" "+salida.getCodigo()+" "+salida.getNombre()+'\n'+
		fechaHoraArribo.getDayOfWeek()+" "+ fechaHoraArribo.getDayOfMonth()+" de "+ fechaHoraArribo.getMonth()+" "+
		fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+" "+arribo.getCodigo()+" "+arribo.getNombre()+'\n'+
		"Operado por "+aerolinea.getNombre()+" Duracion "+horas+"h "+ minutos+"m" );
	}
	
	public String mostrarDetalleAsignacion(){
		System.out.println("Detalle de Asignaciones - Vuelo "+codigoVuelo);
		
		for (Asiento asiento : avion.getListaasiento()) {
			for (Asignacion asignacion : pasajeros1) {
				if (asiento.getIdAsiento() == asignacion.getAsiento().getIdAsiento()){
					System.out.println("Asiento "+ asiento.getIdAsiento() + " - Ocupado");
					break;
				}
				else {
					System.out.println("Asiento "+asiento.getIdAsiento() + " - Libre");
					break;
				}
			}
		}
		return "";
	}
}
