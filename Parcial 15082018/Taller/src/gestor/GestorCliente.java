package gestor;


import java.util.Collection;
import java.util.LinkedList;

import clases.Cliente;
import clases.*;

public class GestorCliente {
	
	public Collection<Cliente> clientes = new LinkedList<>();

	public GestorCliente(LinkedList<Cliente> linkedList) {
		// TODO Auto-generated constructor stub
	}

	public void crearCliente(Cliente factoryCliente) {
		clientes.add(factoryCliente);		
	}

	public LinkedList<Cliente> getColeccionClientes() {
		return (LinkedList<Cliente>) clientes;
	}

}
