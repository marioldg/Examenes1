package examenCuenta;

public class CuentaCorriente {

	private Titular titular;
	private String cuenta;
	private double saldo;
	
	public CuentaCorriente(Titular titular, String cuenta, double saldo){
		
		this.titular = titular;
		this.cuenta = cuenta;
		this.saldo = saldo;
		
	}
	
		
	public void reintegro(double cantidad) {
		if(getSaldo()>=cantidad) {
			setSaldo(getSaldo()-cantidad);
		}else {
			System.out.println("No hay ingresos suficientes");
		}
	}
	
	public void ingreso(double cantidad) {
		setSaldo(getSaldo()+cantidad);
	}
	

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [titular=" + titular + ", cuenta=" + cuenta + ", saldo=" + saldo + "]";
	}
	

}
