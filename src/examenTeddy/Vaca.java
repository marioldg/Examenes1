package examenTeddy;

public class Vaca {
	private String nombre;
	private int leche;
	private int peso;
	private int talla;

	public Vaca(String nombre, int leche, int peso, int talla) {
		this.nombre = nombre;
		this.leche = leche;
		this.peso = peso;
		this.talla = talla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLeche() {
		return leche;
	}

	public void setLeche(int leche) {
		this.leche = leche;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}
}
