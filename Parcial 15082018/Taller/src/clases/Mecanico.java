package clases;

import java.time.LocalDate;

public class Mecanico {
	//Atributos Mecanico: ID, Apellido, Nombres, Matricula, Fecha de Nacimiento, Direccion
	private int idMecanico;
	private String apellido;
	private String nombre;
	private String matricula;
	private LocalDate fechaNacimiento;
	private String direccion;
	

	private Mecanico(int idMecanico, String apellido, String nombre, String matricula, LocalDate fechaNacimiento,
			String direccion) {
		super();
		this.idMecanico = idMecanico;
		this.apellido = apellido;
		this.nombre = nombre;
		this.matricula = matricula;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}

	public static Mecanico instancia(int idMecanico, String apellido, String nombre, String matricula, LocalDate fechaNacimiento,
			String direccion) {
		if (matricula==null) {
			return null;
		}
		else {
			return new Mecanico(idMecanico, apellido, nombre, matricula, fechaNacimiento, direccion);
		}
	}

	public String mostrarMecanico() {
//		Perez, Juan Carlos (1000)
		return apellido+", "+nombre+" ("+matricula+")";
	}

}
