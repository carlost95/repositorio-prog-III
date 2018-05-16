package test;
import logicaGestores.*;
public class TestGestor {

	private static GestorCiudad gestorCiudad;

	public static void main(String[] args) {
		if (gestorCiudad == null) {
			gestorCiudad = new GestorCiudad();
		}
		if( gestorCiudad.agregarCiudad(null)) {
			System.out.println("ase agrego la ciudad");
		}
	}
	
}
