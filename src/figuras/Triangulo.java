package figuras;

public class Triangulo extends Rectangulo {

	public Triangulo(String color, double base, double altura) {
		super(color, base, altura);
	}

	public double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

}
