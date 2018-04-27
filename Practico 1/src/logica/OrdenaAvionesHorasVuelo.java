package logica;
import java.util.Comparator;
public class OrdenaAvionesHorasVuelo implements Comparator<Avion> {
	@Override
	public int compare(Avion avion1, Avion avion2) {
		return  avion1.getHorasVueloAvion()-avion2.getHorasVueloAvion();
	}

}
