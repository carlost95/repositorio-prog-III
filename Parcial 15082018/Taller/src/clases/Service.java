package clases;

import java.time.LocalDate;

public class Service {
	//Atributos Service: ID, Vehiculo, Cliente, Fecha de Service, Detalle, Precio Final
	private int idService;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private LocalDate fechaDeService;
	private String detalle;
	private float precioFinal;
	

	private Service(int idService, Vehiculo vehiculo, Cliente cliente, LocalDate fechaDeService, String detalle,
			float precioFinal) {
		super();
		this.idService = idService;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.fechaDeService = fechaDeService;
		this.detalle = detalle;
		this.precioFinal = precioFinal;
	}
	//1, elVehiculo, elCliente, LocalDate.of(2018, 10, 10),"Cambio de Aceite y Filtro",1500.00f
	public static Service instancia(int idService, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaDeService,
			String detalle, float precioFinal) {
		if (elVehiculo == null) {
			return null;
		}
		else
		{
			return new Service(idService, elVehiculo, elCliente, fechaDeService, detalle, precioFinal);
		}
	}

	public String mostrarResumen() {
		//"Service Nro: 1\nCliente: Lopez, Juan Manuel - 3825405060\nVehiculo: VW Golf modelo 2009 - Patente ABC123
		//\nTrabajo Realizado: Cambio de Aceite y Filtro\nTotal: $ 1500.05", formatoSalida
		
		
		return "Service Nro: "+idService+'\n'+
				"Cliente: "+cliente.mostrarCliente()+'\n'+
				"Vehiculo: "+vehiculo.mostrarVehiculo()+'\n'+
				"Trabajo Realizado: "+detalle+'\n'+
				"Total: $ "+precioFinal;
	}

}
