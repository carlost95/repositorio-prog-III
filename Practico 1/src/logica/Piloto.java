package logica;

import java.sql.Date;

public class Piloto {
	private int idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private String fechaNacimiento;
	public Piloto(int idPiloto, String apellido, String nombre, String documento, String fechaNacimiento) {
		super();
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Piloto"+" "+ idPiloto +" "+ apellido +" "+ nombre +" "+ documento  +" "+ fechaNacimiento ;
	}
	
}
