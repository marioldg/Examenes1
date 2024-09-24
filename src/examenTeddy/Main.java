package examenTeddy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vaca> vacas = new ArrayList<>();
		vacas.add(new Vaca("Vaca1", 10, 300, 150));
		vacas.add(new Vaca("Vaca2", 12, 280, 160));
		vacas.add(new Vaca("Vaca3", 12, 280, 155));
		Ganaderia ganaderia = new Ganaderia(vacas);
		System.out.println("Vaca con más leche: " + ganaderia.masLeche());
		System.out.println("Vaca con más peso: " + ganaderia.masPeso());
		System.out.println("Vaca con más talla: " + ganaderia.masTalla());
		System.out.println("Vaca con más leche, peso y talla: " + ganaderia.masLechePesoTalla());
		System.out.println("Vaca con topes: " + ganaderia.masconTopes(10, 270, 155));

	}
}
