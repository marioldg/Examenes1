package examenCuenta;

public class CuentaAhorro extends CuentaCorriente {

	private double interes;

	public CuentaAhorro(Titular titular, String cuenta, double saldo, double interes) {
		super(titular, cuenta, saldo);
		this.interes = interes;
	}

	public void setInteres(double interesX) {
		this.interes = interesX;
	}
	
	public double getInteres() {
		return interes;
	}
	
	public double calcularInteres() {
		double total = this.getSaldo() * (this.interes /100);
		this.ingreso(total);
		return total;
	}

	@Override
	public String toString() {
		return "CuentaAhorro . [interes=" + interes + ", getInteres()=" + getInteres() + "]";
	}
	
	

}
