package logica;

import java.util.Comparator;

public class OrdenaPilotoHorasVuelo implements Comparator<Piloto> {
	public int compare(Piloto piloto1, Piloto piloto2) {
		return  piloto1.getHorasDeVuelo()-piloto2.getHorasDeVuelo();
	}

}
