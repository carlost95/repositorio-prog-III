package clases;

public class Vehiculo {
	//Atributos Vehiculo: ID, Marca y Modelo, Patente, Año
	private int idVehiculo;
	private String marca;
	private int modelo;
	private String patente;
	private int anio;
	
	
	private Vehiculo(int idVehiculo, String marca, String patente, int anio) {
		super();
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.patente = patente;
		this.anio = anio;
	}

	public static Vehiculo instancia(int idVehiculo, String marca, String patente, int anio) {
	if (patente==null) {
		return null;
	}
	else 
		return new Vehiculo(idVehiculo, marca, patente, anio);
	}

	public String mostrarVehiculo() {
		
		return marca+" modelo "+anio+" - Patente "+patente;
	}

}
