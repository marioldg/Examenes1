package avion;
//subclase
public class AvionCarga extends Avion {

	private int kilosCarga;

	public AvionCarga(String nombre, String compañia, int anio, double precio, int kilosCarga) {
		super(nombre, compañia, anio, precio);
		this.kilosCarga = kilosCarga;
	}

	public double pago() {
		double preciototal = 0;
		if(kilosCarga>=10 && kilosCarga<=30) {
			System.out.println("precio 5%");
			preciototal = getPrecio() + getPrecio()*0.05;
		}else if(kilosCarga>=30 && kilosCarga<=80){
			System.out.println("precio 10%");
			preciototal = getPrecio() + getPrecio()*0.10;
		}else {
			System.out.println("precio 20%");
			preciototal = getPrecio() + getPrecio()*0.20;
		}
		return preciototal;
	}

	public int getKilosCarga() {
		return kilosCarga;
	}

	public void setKilosCarga(int kilosCarga) {
		this.kilosCarga = kilosCarga;
	}

}
