package logica;

import java.sql.Date;
import java.time.LocalDate;

public class Piloto {
	private int idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;
	private int horasDeVueloPiloto;
	
	public Piloto(int idPiloto, String apellido, String nombre, String documento, LocalDate fechaNacimiento, int horasDeVueloPiloto) {
		super();
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.horasDeVueloPiloto = horasDeVueloPiloto;
	}
	
	public int getHorasDeVueloPiloto() {
		return horasDeVueloPiloto/60;
	}

	public void setHorasDeVueloPiloto(int horasDeVuelo) {
		this.horasDeVueloPiloto = horasDeVueloPiloto;
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void contadorHorasVuelo(int horasVueloActual) {
		horasDeVueloPiloto += horasVueloActual;
	}
	
}
