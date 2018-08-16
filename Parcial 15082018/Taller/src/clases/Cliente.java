package clases;

import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private   int idCliente;
	private   String Apellido;
	private   String Nombres;
	private   String Documento;
	private   LocalDate fechaDeNacimiento;
	private   String Direccion;
	private   String Telefono;
	private   Collection<Vehiculo> Vehiculos = new LinkedList<>();

	public static  Cliente instancia(int idCliente, String apellido, String nombre, String documento,
			LocalDate fechadeNacimiento, String direccion, String telefono) {

		if (documento == null)
			return null;
		else {
			 return new Cliente(idCliente,apellido,nombre,documento,fechadeNacimiento,direccion,telefono);
		}

	}

	private  Cliente(int idDeCliente, String apellido, String nombres, String documento, LocalDate fechadeNacimiento,
		String direccion, String telefono) {
		idCliente = idDeCliente;
		Apellido = apellido;
		Nombres = nombres;
		Documento = documento;
		fechaDeNacimiento = fechadeNacimiento;
		Direccion = direccion;
		Telefono = telefono;

	}

	public void asignarVehiculo(Vehiculo elVehiculo) {
		Vehiculos.add(elVehiculo);

	}

	public Collection<Vehiculo> devolverVehiculos() {
		return Vehiculos;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getApellido() {
		return Apellido;
	}

	public String getNombres() {
		return Nombres;
	}

	public String getDocumento() {
		return Documento;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public Collection<Vehiculo> getVehiculos() {
		return Vehiculos;
	}

	public String mostrarCliente() {
		
		//"Lopez, Juan Manuel - 3825405060"
		return Apellido+", "+ Nombres +" - "+Telefono;
	}

	}

