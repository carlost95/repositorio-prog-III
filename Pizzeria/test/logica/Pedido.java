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
	private Collection <Pizza> pizzas = new LinkedList<>();
	public static int num=0;
		
	public Pedido(String nombre, String domicilio, double importe, LocalDate fechaEntrega, Pizza pizzaPedido) {
		this.idPedido = num;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.importe = importe;
		this.fechaEntrega = fechaEntrega;
		this.pizzas.add(pizzaPedido);
		num++;
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

	public double importeTotal() {
		return importe;
	}

	public void agregarPizza(Pizza pizzaNueva) {
		this.pizzas.add(pizzaNueva);
	}

	public Collection<Pizza> getPizzas() {
		return pizzas;
	}

	public String getBase() {
		return "Masa Tipo";
	}

}
