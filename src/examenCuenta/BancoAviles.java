package examenCuenta;

public class BancoAviles {

	public static void main(String[] args) {
		Titular titular1 = new Titular("Noe", "Tira Donada", 39);
		CuentaCorriente ctaTitular1 = new CuentaCorriente(titular1, "0000001", 0);
		ctaTitular1.ingreso(1000);
		ctaTitular1.reintegro(300);
		System.out.println(ctaTitular1);
		CuentaAhorro ctaTitular2 = new CuentaAhorro(titular1,"000002", 0, 0);
		ctaTitular1.ingreso(3000);
		System.out.println(ctaTitular1);
		ctaTitular2.setInteres(2.5);
		ctaTitular2.getInteres();
		ctaTitular2.calcularInteres();
		System.out.println(ctaTitular2);


	}

}
