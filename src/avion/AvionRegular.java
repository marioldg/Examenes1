package avion;

public class AvionRegular extends Avion {

	private int numeroAsientos;
	public AvionRegular(String nombre, String compañia, int anio, double precio,int num) {
		super(nombre, compañia, anio, precio);
		this.numeroAsientos = num;
	}
	
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	@Override
	public String toString() {
		return "AvionRegular [numeroAsientos=" + numeroAsientos + "]";
	}

}
