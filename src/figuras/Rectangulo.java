package figuras;

import java.util.List;

public class Rectangulo extends FigurasGeometricas {

	private double base;
	private double altura;

	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;

	}

	public double totalPerimetro(List<Rectangulo> listaRectangulos) {
		double total = 0;
		for (Rectangulo rec : listaRectangulos) {
			total = rec.perimetroRectangulo() + total;
		}
		return total;
	}

	public double perimetroRectangulo() {
		return (getBase() * 2) + (getAltura() * 2);
	}

	public double areaRectangulo(double base, double altura) {
		return base * altura;
	}

	public double areaRectangulo2() {
		return getBase() * getAltura();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

}
