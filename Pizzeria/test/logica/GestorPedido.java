package logica;

import java.util.Collection;
import java.util.LinkedList;

public class GestorPedido {
	private LinkedList <Pedido> pedidos;

	public GestorPedido(LinkedList<Pedido> linkedList) {
		// TODO Auto-generated constructor stub
	}

	public void crearPedido(Pedido factoryPedido) { 
		pedidos.add(factoryPedido);
	}

	public LinkedList<Pedido> getColeccionPedidos() {
		return this.pedidos;
}
}
