package figuras;

public class FigurasGeometricas {
	private String color;
	private double area;
	
	
	public FigurasGeometricas(String color){
		this.color = color;
		this.area = 0;
	
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "FigurasGeometricas [color=" + color + ", area=" + area + "]";
	}

	
}
