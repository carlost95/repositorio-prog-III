package logica;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class GestorPedido {
	private LinkedList <Pedido> pedidos = new 	LinkedList<>();

	public GestorPedido(LinkedList<Pedido> linkedList) {

	}

	public LinkedList<Pedido> getColeccionPedidos() {
		return this.pedidos;
}

	public void crearPedido(Pedido pedidoACrear) {
		pedidos.add(pedidoACrear);
		
	}
}
