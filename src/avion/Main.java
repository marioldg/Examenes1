package avion;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		AvionRegular avion1 = new AvionRegular("Pepe","Volotea",1945, 120, 87);
		AvionRegular avion2 = new AvionRegular("Tete","Volotea",1999, 100, 140);
		AvionRegular avion3 = new AvionRegular("Poti","Ryanair",1975, 110, 67);
		AvionRegular avion4 = new AvionRegular("Pipa","Ryanair",1995, 123, 122);
		
		
		AvionCarga avion5 = new AvionCarga("Teddy", "Iberia", 1969, 187, 57);
		AvionCarga avion6 = new AvionCarga("Pecado", "Volotea", 1999, 187, 97);
		AvionCarga avion7 = new AvionCarga("Vinilo", "Iberia", 2000, 156, 87);
		AvionCarga avion8 = new AvionCarga("Cotton", "Volotea", 2003, 190, 176);

		ArrayList<AvionRegular> listaAvionesRegulares = new ArrayList<>();
		listaAvionesRegulares.add(avion1);
		listaAvionesRegulares.add(avion2);
		listaAvionesRegulares.add(avion3);
		listaAvionesRegulares.add(avion4);
		
		Aerodromo ae1 = new Aerodromo();
		System.out.println(ae1.masAsientos(listaAvionesRegulares));
		System.out.println(ae1.getAviones1950(listaAvionesRegulares));
		
		//Una lista que devuelve el nombre de los aviones cuya compañia sea Volotea
		System.out.println(ae1.listaVolotea(listaAvionesRegulares));
		
		//Metodo que devuelva el avion mas caro
		
		
		ArrayList<AvionCarga> listaAvionesCarga = new ArrayList<>();
		listaAvionesCarga.add(avion5);
		listaAvionesCarga.add(avion6);
		listaAvionesCarga.add(avion7);
		listaAvionesCarga.add(avion8);
		
		System.out.println(ae1.avionMasCaro(listaAvionesCarga, listaAvionesRegulares));
	
	}

}