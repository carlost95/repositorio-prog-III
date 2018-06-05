package logica;

import java.util.ArrayList;
import java.util.Arrays;

public class Avion {
	private int idAvion;
	private String modelo;
	private String matricula;
	private ArrayList<Asiento> listaAsiento;
	private int horasVueloAvion;

	
	
	
	public Avion(int idAvion, String modelo, String matricula, ArrayList<Asiento> listaAsiento) {
		super();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsiento = listaAsiento;
		this.horasVueloAvion = horasVueloAvion;
	}
	public int getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public ArrayList<Asiento> getListaasiento() {
		return listaAsiento;
	}
	public void setListaasiento(ArrayList<Asiento> listaasiento) {
		this.listaAsiento = listaasiento;
	}
	public int getHorasVueloAvion() {
		return horasVueloAvion/60;
	}

	public void setHorasVueloAvion(int horasVueloAvion){
		this.horasVueloAvion = horasVueloAvion;
	}
	public void contadorHorasVuelo(int horaVueloActual) {
		this.horasVueloAvion += horaVueloActual;
		
	}
}