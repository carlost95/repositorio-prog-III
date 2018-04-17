package logica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class test {
	public static void main(String[] args) {
		Piloto p1 = new Piloto(1, "perez", "pepe", "dni 12345", LocalDate.of(1972, 3, 9));
		Piloto p2 = new Piloto(2, "sosa", "andres", "dni 6789", LocalDate.of(1965, 2, 12));
		
		Ciudad c1 = new Ciudad(1, "La Rioja", "5360");
		Ciudad c2 =  new Ciudad(3, "Buenos Aires", "1234");
		
		Aerolinea a1 = new Aerolinea(1, "AIL");
		
		Pasajero ps1 = new Pasajero(0001, "20234658768", "Lopez", "Juan", "12345");
		
		Avion v1 = new Avion(0001, "KN345", "FWR234", null);		
		
		Asiento as1 = new Asiento(3, "L2");
		
		Aeropuerto ae1= new Aeropuerto(2, "Aeropuerto Capitán Vicente Almandos Almonacid", c1, "IRJ");
		Aeropuerto ae2= new Aeropuerto(5, "Aeropuerto Buenos Aires Jorge Newbery", c2, "EAP");
		
		Vuelo v12 = new Vuelo("1111",ae1 , LocalDateTime.of(LocalDate.of(2000, 1, 3), LocalTime.of(7, 22)), ae2, LocalDateTime.of(LocalDate.of(2000, 1, 3),LocalTime.of(8, 23)), a1, null, v1, null);
		
		/*
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		System.out.println(a1);
		System.out.println(ps1);
		System.out.println(v1);
		System.out.println(as1);
		System.out.println(v12);
		*/
		ae1.mostrarAeropuerto(ae1);
		ae2.mostrarAeropuerto(ae2);
	}
	

}
