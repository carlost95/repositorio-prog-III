package logicaGestores;

import java.util.Collection;
import java.util.LinkedList;

import logica.Avion;
import logica.Vuelo;

public class GestorAvion {
	
	private LinkedList<Avion> linkedList =new LinkedList<>();

	public GestorAvion(LinkedList<Avion> linkedList) {
		
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
		int horasDeVueloAvion = 0;
		for (Vuelo vuelo : crearVuelos) {
		}
		return horasDeVueloAvion;
	}
	public LinkedList<Avion> getColeccionAviones() {
		
		return linkedList;
	}
}
