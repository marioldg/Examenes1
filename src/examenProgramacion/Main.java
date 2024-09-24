package examenProgramacion;

public class Main {

	public static void main(String[] args){
		
		Vaca[] listaVacas = new Vaca[4]; // Crear un array

		Vaca vaca1 = new Vaca(100, 800, 3, "Vaca1");
		Vaca vaca2 = new Vaca(300, 900, 5, "Vaca2");
		Vaca vaca3 = new Vaca(300, 900, 1, "Vaca3");
		Vaca vaca4 = new Vaca(300, 900, 2, "Vaca4");

		// Añadir las vacas al array
		listaVacas[0] = vaca1;
		listaVacas[1] = vaca2;
		listaVacas[2] = vaca3;
		listaVacas[3] = vaca4;
		
		Ganaderia ganaderia = new Ganaderia(listaVacas);
		ganaderia.masLeche();
		ganaderia.masPeso();
		ganaderia.masLechePesoTalla();
	}
}
