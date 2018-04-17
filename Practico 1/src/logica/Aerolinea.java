package logica;

public class Aerolinea {
	private int idAerolinea;
	private String nombre;
	public Aerolinea(int idAerolinea, String nombre) {
		super();
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Aerolinea    "+ idAerolinea  +" "+ nombre ;
	}
	
	
	
}
