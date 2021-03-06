package logica;

public class Aeropuerto {
	private int idAeropuerto;
	private String nombre;
	private Ciudad ciudad;
	private String codigo;
	public Aeropuerto(int idAeropuerto, String nombre, String codigo, Ciudad ciudad) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo = codigo;
	}
	public int getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Aeropuerto  " + idAeropuerto + " " + nombre + " " + ciudad + " " + codigo ;
	}
	public String showDenomination(){
	return (nombre +" - "+ ciudad.getNombre() +" - "+codigo );
	}
}
 