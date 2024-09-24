package figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Rectangulo abuela = new Rectangulo("azul", 10, 4);
		Rectangulo rec1 = new Rectangulo("verde", 8, 4);
		Rectangulo rec2 = new Rectangulo("rojo", 4, 2);
		//metodo pasando parametros 
		System.out.println(rec1.areaRectangulo(8, 4));
		//metodo sin pasar parametros usando get 
		System.out.println(rec1.areaRectangulo2());
		System.out.println("el perimetro del rectangulo es: "+ rec1.perimetroRectangulo());
		
		System.out.println(rec2.areaRectangulo2());
		System.out.println("el perimetro del rectangulo2 es: "+ rec2.perimetroRectangulo());
		
		System.out.println("-----------------MARIO---------------------");
		System.out.println(rec1.perimetroRectangulo());
		System.out.println(rec2.perimetroRectangulo());
		System.out.println(abuela.perimetroRectangulo());
		List<Rectangulo> list = new ArrayList<>();
		list.add(rec1);
		list.add(rec2);
		list.add(abuela);
		System.out.println(rec1.totalPerimetro(list));
		System.out.println("----------------APRUEBA-------------------");
	}

}
