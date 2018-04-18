package logica;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
		ArrayList <Asignacion> pasajeros = new ArrayList<Asignacion>();
		ArrayList<Asiento> asientosAvion = new ArrayList<Asiento>();
		
		Piloto p1 = new Piloto(1, "Perez","Juan Antonio","07071970", LocalDate.of(1970, 07, 07));
		Piloto p2 = new Piloto(2, "Martínez", "Juan Ignacio","08081978", LocalDate.of(1978, 8, 8));
		Piloto p3 = new Piloto(3, "López", "Juan Cralos", "05051950", LocalDate.of(1950, 05, 05));
		Piloto p4 = new Piloto(4, "Gomez", "juan Gabriel", "10101960", LocalDate.of(1960, 10, 10));
		Piloto p5 = new Piloto(5, "Juarez", "Leonel Agustin", "07365987", LocalDate.of(1968, 03, 05));
			
		pilotos.add(p1);
		pilotos.add(p2);
		pilotos.add(p3);
		pilotos.add(p4);
		pilotos.add(p5);
		
		Ciudad c1 = new Ciudad(1, "La Rioja", "5360");
		Ciudad c2 =  new Ciudad(2, "Buenos Aires", "1000");
		Ciudad c3 = new Ciudad(3, "Mendoza", "5500");	
		Ciudad c4 = new Ciudad(4, "Tucumán", "4000");
		

		Aeropuerto ae1= new Aeropuerto(2, "Aeropuerto Capitán Vicente Almandos Almonacid", c1, "IRJ");
		Aeropuerto ae2= new Aeropuerto(5, "Aeropuerto Buenos Aires Jorge Newbery", c2, "EAP");
		Aeropuerto ae3 = new Aeropuerto(3, "Aeropuerto El Plumerillo", c3, "MDZ");
		Aeropuerto ae4 = new Aeropuerto(4, "Aeropuerto Benjamín Matienzo", c4, "TUC");
		
		Pasajero ps1 = new Pasajero(1, "20123456784", "Ramírez","Ramiro Ramón", "12345678");
		Pasajero ps2 = new Pasajero(2, "20102030404",  "Fernández", "Fernando Fermín", "10203040");
		Pasajero ps3 = new Pasajero(3, "20987654324", "Martínez", "Martín Marcos", "98765432");
		Pasajero ps4 = new Pasajero(4, "20198273644", "Rodríguez", "Rodrigo Rogelio", "19827364");
		Pasajero ps5 = new Pasajero(5, "20234658768", "Lopez", "Juan", "12345876");


		Aerolinea a1 = new Aerolinea(1, "Aerolíneas Argentinas");
		Aerolinea a2 = new Aerolinea(2, "Austral");
		Aerolinea a3 = new Aerolinea(3, "LATAM");
		Aerolinea a4 = new Aerolinea(4, "Iberia");
		Aerolinea a5 = new Aerolinea(5, "Emirates");
				
		Avion v1 = new Avion(1, "Airbus A340-313X", "LV-FPV", asientosAvion);	
		Avion v2 = new Avion(2, "Airbus A330-223", "LV-FNI", asientosAvion);
		Avion v3 = new Avion(3, "Boeing 737-8MB", "LV-FYK", asientosAvion);
		Avion v4 = new Avion(4, "Embraer ERJ-190-100AR", "LV-CIH", asientosAvion);
		Avion v5 = new Avion(4, "A320", "LV-CBV", asientosAvion);
		
		Asiento as1 = new Asiento(1, "A1");
		Asiento as2 = new Asiento(2, "B1");
		Asiento as3 = new Asiento(3, "C1");
		Asiento as4 = new Asiento(4, "H1");
		Asiento as5 = new Asiento(5, "J1");
		Asiento as6 = new Asiento(6, "K1");
		Asiento as7 = new Asiento(7, "A2");
		Asiento as8 = new Asiento(8, "B2");
		Asiento as9 = new Asiento(9, "C2");
		Asiento as10 = new Asiento(10, "H2");
		Asiento as11 = new Asiento(11, "J2");
		Asiento as12 = new Asiento(12, "K2");
	
		
		Vuelo v12 = new Vuelo("AR2443",ae1 , LocalDateTime.of(LocalDate.of(2018, 4, 10), LocalTime.of(21, 10)), ae2, LocalDateTime.of(LocalDate.of(2018, 4, 10),LocalTime.of(22, 45)), a1, pilotos, v1, pasajeros);
		Vuelo v13 = new Vuelo("AR2443",ae2 , LocalDateTime.of(LocalDate.of(2000, 1, 3), LocalTime.of(7, 22)), ae4, LocalDateTime.of(LocalDate.of(2000, 1, 3),LocalTime.of(8, 23)), a1, null, v1, null);
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
		for (Asignacion pasajero : pasajeros) {
			System.out.println(ps1);
		}
	}
	

}
