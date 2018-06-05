package logica;

import java.awt.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class test {
	public static void main(String[] args) {
		ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
		ArrayList <Asignacion> pasajeros = new ArrayList<Asignacion>();
		ArrayList<Asiento> asientosAvion = new ArrayList<Asiento>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
		ArrayList<Vuelo> vuelos = new ArrayList<>();
		ArrayList<Piloto> pilotosMayores = new ArrayList<>(); 
		ArrayList<Avion> aviones =  new ArrayList<>();
		ArrayList<Ciudad> ciudades = new ArrayList<>();
		
		Piloto p1 = new Piloto(1, "Perez","Juan Antonio","07071970", LocalDate.of(1970, 07, 07));
		Piloto p2 = new Piloto(2, "Martínez", "Juan Ignacio","08081978", LocalDate.of(1978, 8, 8));
		Piloto p3 = new Piloto(3, "López", "Juan Carlos", "05051950", LocalDate.of(1950, 05, 05));
		Piloto p4 = new Piloto(4, "Gomez", "juan Gabriel", "10101960", LocalDate.of(1960, 10, 10));
		Piloto p5 = new Piloto(5, "Juarez", "Leonel Agustin", "07365987", LocalDate.of(1968, 03, 05));
			
		pilotos.add(p1);
		pilotos.add(p2);
//		pilotos.add(p3);
//		pilotos.add(p4);
//		pilotos.add(p5);
//		
		Ciudad c1 = new Ciudad(1, "La Rioja", "5360");
		Ciudad c2 =  new Ciudad(2, "Buenos Aires", "1000");
		Ciudad c3 = new Ciudad(3, "Mendoza", "5500");	
		Ciudad c4 = new Ciudad(4, "Tucumán", "4000");
		
		ciudades.add(c1);

		Aeropuerto ae1= new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", "IRJ", c1);
		Aeropuerto ae2= new Aeropuerto(2, "Aeropuerto Buenos Aires Jorge Newbery", "EAP", c2);
		Aeropuerto ae3 = new Aeropuerto(3, "Aeropuerto El Plumerillo", "MDZ", c3);
		Aeropuerto ae4 = new Aeropuerto(4, "Aeropuerto Benjamín Matienzo", "TUC", c4);
		
		Pasajero ps1 = new Pasajero(1, "20123456784", "Ramírez","Ramiro Ramón", "12345678");
		Pasajero ps2 = new Pasajero(2, "20102030404",  "Fernández", "Fernando Fermín", "10203040");
		Pasajero ps3 = new Pasajero(3, "20987654324", "Martínez", "Martín Marcos", "98765432");
		Pasajero ps4 = new Pasajero(4, "20198273644", "Rodríguez", "Rodrigo Rogelio", "19827364");
		Pasajero ps5 = new Pasajero(5, "20234658768", "Lopez", "Juan Carlos", "12345876");

		
		Aerolinea a1 = new Aerolinea(1, "Aerolíneas Argentinas");
		Aerolinea a2 = new Aerolinea(2, "Austral");
		Aerolinea a3 = new Aerolinea(3, "LATAM");
		Aerolinea a4 = new Aerolinea(4, "Iberia");
		Aerolinea a5 = new Aerolinea(5, "Emirates");

		Avion v1 = new Avion(1, "Airbus A340-313X", "LV-FPV", asientosAvion);	
		Avion v2 = new Avion(2, "Airbus A330-223", "LV-FNI", asientosAvion);
		Avion v3 = new Avion(3, "Boeing 737-8MB", "LV-FYK", asientosAvion);
		Avion v4 = new Avion(4, "Embraer ERJ-190-100AR", "LV-CIH", asientosAvion);
		Avion v5 = new Avion(5, "A320", "LV-CBV", asientosAvion);

		
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
		Asiento as13 = new Asiento(13,"A3");
		Asiento as14 = new Asiento(14,"B3");
		Asiento as15 = new Asiento(15,"C3");
		Asiento as16 = new Asiento(16,"H3");
		Asiento as17 = new Asiento(17,"J3");
		Asiento as18 = new Asiento(18,"K3");
		Asiento as19 = new Asiento(19,"A4");
		Asiento as20 = new Asiento(20,"B4");
		Asiento as21 = new Asiento(21,"C4");
		Asiento as22 = new Asiento(22,"H4");
		Asiento as23 = new Asiento(23,"J4");
		Asiento as24 = new Asiento(24,"K4");
	
		
		
		asientosAvion.add(as1);asientosAvion.add(as13);
		asientosAvion.add(as2);asientosAvion.add(as14);
		asientosAvion.add(as3);asientosAvion.add(as15);
		asientosAvion.add(as4);asientosAvion.add(as16);
		asientosAvion.add(as5);asientosAvion.add(as17);
		asientosAvion.add(as6);asientosAvion.add(as18);
		asientosAvion.add(as7);asientosAvion.add(as19);
		asientosAvion.add(as8);asientosAvion.add(as20);
		asientosAvion.add(as9);asientosAvion.add(as21);
		asientosAvion.add(as10);asientosAvion.add(as22);
		asientosAvion.add(as11);asientosAvion.add(as23);
		asientosAvion.add(as12);asientosAvion.add(as24);
		
		Asignacion asi1 = new Asignacion(ps1, as1, "AR2443100420182012345678443");
		Asignacion asi2 = new Asignacion(ps2, as2, "AR2443100420182019827364441");
		Asignacion asi3 = new Asignacion(ps3, as6, "AR2443100420182019827364442");
		Asignacion asi4 = new Asignacion(ps4, as8, "AR2443100420182019827364446");
		Asignacion asi5 = new Asignacion(ps5, as19, "AR2443100420182019827364448");
		
		pasajeros.add(asi1);
		pasajeros.add(asi2);
		pasajeros.add(asi3);
		pasajeros.add(asi4);
		pasajeros.add(asi5);
				
		
		Vuelo vu1 = new Vuelo("AR2443",ae1,LocalDateTime.of(2018, 04, 10, 21, 35),ae2,LocalDateTime.of(2018, 04, 10, 22, 45),a1,pilotos,v1,pasajeros);
		
		vuelos.add(vu1);
		
		aeropuertos.add(ae1);
		aeropuertos.add(ae2);
		aeropuertos.add(ae3);
		aeropuertos.add(ae4);
		
		aviones.add(v1);
		aviones.add(v2);
		aviones.add(v3);
		aviones.add(v4);
		aviones.add(v5);

		for (Piloto piloto : pilotos) {
			if (calcularEdad (piloto) > 40){
				pilotosMayores.add(piloto);
				
			}
		}
		Collections.sort(pilotosMayores, new OrdenaPilotosMayores());
		
		System.out.println("------------------mostrar aeroppuertos---------------------------");
		for (Aeropuerto aeropuerto : aeropuertos) {
			System.out.println(aeropuerto.showDenomination());
		}
		System.out.println("----------------se muestra los detalles del vuelo----------------");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.getDetails());
		}
		System.out.println("-----------------mostrar detalle de asignacion-------------------");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.mostrarDetalleAsignacion());
		}
		
		System.out.println("-------------------Mostrar los pilotos mayores-------------------");
		mostrarPilotosMayores(pilotosMayores);
		System.out.println("------------------Mostrar Horas de Aviones-----------------------");
		
		Collections.sort(aviones, new OrdenaAvionesHorasVuelo());
		for (Avion avion : aviones) {
			System.out.println(avion.getModelo()+" ("+ avion.getMatricula() + ") - "+ avion.getHorasVueloAvion()+" hs de vuelo");
		}
		
		Collections.sort(pilotos, new OrdenaPilotoHorasVuelo());
		System.out.println("---------------------Mostrar HS de los Pilotos-------------------");
		mostrarHorasPilotos(pilotos);
	}
	
	private static void mostrarHorasPilotos(ArrayList<Piloto> pilotos) {
		for (Piloto piloto : pilotos) {

			System.out.println(piloto.getApellido()+" "+piloto.getNombre()+" - "+calcularEdad(piloto)+" años. " +piloto.getHorasDeVueloPiloto()+" horas de vuelo");

			System.out.println(piloto.getApellido()+" "+piloto.getNombre()+" "+calcularEdad(piloto)+" años " +piloto.getHorasDeVueloPiloto()+" horas de vuelo");

		}
	}

	private static void mostrarPilotosMayores(ArrayList<Piloto>pilotosMayores) {
		for (Piloto piloto : pilotosMayores ) {
			System.out.println(piloto.getApellido()+", "+ piloto.getNombre()+"-"+calcularEdad(piloto)+" años");
		}
		return ;
	}
	
	private static int calcularEdad (Piloto piloto) {
		int  EDAD = LocalDate.now().getYear()-piloto.getFechaNacimiento().getYear();
		return EDAD;
	}
	
}



