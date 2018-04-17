package logica;

import java.util.Arrays;

public class Avion {
	private int idAvion;
	private String modelo;
	private String matricula;
	private Asiento listaasiento [];
	public Avion(int idAvion, String modelo, String matricula, Asiento[] listaasiento) {
		super();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaasiento = listaasiento;
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
	public Asiento[] getListaasiento() {
		return listaasiento;
	}
	public void setListaasiento(Asiento[] listaasiento) {
		this.listaasiento = listaasiento;
	}
	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", modelo=" + modelo + ", matricula=" + matricula + ", listaasiento="
				+ Arrays.toString(listaasiento) + "]";
	}
	
	
}