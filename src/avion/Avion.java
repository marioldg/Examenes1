package avion;
//superclase
public class Avion {
	
	private String nombre;
	private String compañia;
	private int anio;
	private double precio;
	
	public Avion(String nombre, String compañia, int anio, double precio) {
		this.nombre = nombre;
		this.compañia = compañia;
		this.anio = anio;
		this.precio = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Avion [nombre=" + nombre + ", compañia=" + compañia + ", anio=" + anio + ", precio=" + precio + "]";
	}

}
