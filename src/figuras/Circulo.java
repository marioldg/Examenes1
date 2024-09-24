package figuras;

public class Circulo extends FigurasGeometricas {
	
	private double radio;
	private static double pi = 3.1416;

	public Circulo(String color,double radio) {
		super(color);
		this.radio = radio;
	}
	
	public double areaCirculo(double radio) {
		return pi * radio * radio;
	}
	
	public double circunferencia(double radio) {
		return pi * 2 * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static double getPi() {
		return pi;
	}

	public static void setPi(double pi) {
		Circulo.pi = pi;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	

}
