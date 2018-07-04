package logica;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;




public class Pedido {
	private Integer idPedido;
	private String nombre;
	private String domicilio;
	private double importe;
	private LocalDate fechaEntrega;
	private Collection <Pizza> pizzas;

		
	public Pedido(String nombre, String domicilio, double importe, LocalDate fechaEntrega, Collection<Pizza> pizzas) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.importe = importe;
		this.fechaEntrega = fechaEntrega;
		this.pizzas = (LinkedList<Pizza>)pizzas;
	}

	public Pedido(Object nombre2, Object domicilio2, double importe2, LocalDate of, Pizza pizzaNapolitana) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public void setPizzas(Collection<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public int importeTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void agregarPizza(Pizza pizzaFugazzeta) {
		this.pizzas.add(pizzaFugazzeta);
	}

	public Collection<Pizza> getPizzas() {
		return this.pizzas;
	}

	public String getBase() {
		return "Masa Tipo";
	}

}
