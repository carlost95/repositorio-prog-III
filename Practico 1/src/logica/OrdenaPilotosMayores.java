package logica;
import java.util.Comparator;

public class OrdenaPilotosMayores implements Comparator<Piloto>{
	public int compare(Piloto piloto1, Piloto piloto2) {
		return  piloto1.getFechaNacimiento().getYear()-piloto2.getFechaNacimiento().getYear();
	}

}
