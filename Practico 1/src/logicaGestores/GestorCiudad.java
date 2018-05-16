package logicaGestores;

import java.util.ArrayList;

import logica.Ciudad;

public class GestorCiudad {
	private ArrayList<Ciudad> ciudades = new ArrayList<>();

	public boolean  agregarCiudad(Ciudad ciudadIngresada) {
		int senial = 1;
		if(ciudadIngresada.getIdCiudad()!=0){
			for (Ciudad ciudad : ciudades) {
				ciudadIngresada.equals(ciudad.getIdCiudad());
				senial = 0;
				
			}
			if (senial == 0) {
				ciudades.add(ciudadIngresada);
				return true;
			}	
		}
		return false;
	}
	public boolean  eliminarCiudad(Ciudad ciudad) {
		return false;
	}
	public boolean  modificarCuiudad (Ciudad ciudad) {
		return false;
	}
	public Ciudad devolverCiudad (Ciudad ciudad) {
		return null;
	}
}
