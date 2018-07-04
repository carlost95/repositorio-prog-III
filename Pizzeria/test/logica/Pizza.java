package logica;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Pizza {

	private Integer idPizza;
	private String nombre;
	private Base base;
	private Collection<Cubierta> cubierta;
	private double precio;
	
	public Pizza(String nombre, double precio,Base base, Collection<Cubierta> cubierta) {
		this.nombre = nombre;
		this.base = base;
		this.cubierta = (LinkedList<Cubierta>)cubierta;
		this.precio = precio;
	}


	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public Collection<Cubierta> getCubierta() {
		return cubierta;
	}
	public void setCubierta(Collection<Cubierta> cubierta) {
		this.cubierta = cubierta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
