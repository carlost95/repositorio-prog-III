package logicaGestores;

import java.util.Collection;
import java.util.LinkedList;

import logica.Avion;
import logica.Vuelo;

public class GestorAvion {
	private LinkedList<Avion> linkedList =new LinkedList<>();

	public GestorAvion(LinkedList<Avion> linkedList) {
		// TODO Auto-generated constructor stub
	}
	
	public  boolean crearAvion (Avion avion) {
		return true;
	}
	public boolean modificarAvion(Avion avion) {
		return true;
	}
	public boolean eliminarAvion (Avion avion) {
		return true;
	}
	
	public boolean devolverAvion(Avion avion) {
		return false;	
	}
	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion avion1) {
		// TODO Auto-generated method stub
		return 0;
	}
	public LinkedList<Avion> getColeccionAviones() {
		
		return linkedList;
	}
}
