package examenEmpleado;

public class TestRRHH1 {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("1234e", 1000, "marketing");
		Gerente gerente = new Gerente("1234g", 1000, "gestion y finanzas", 15);
		Director director = new Director("1234d", 1000, "CEO", 100, false);

		empleado.toString();
		gerente.toString();
		director.toString();
		System.out.println(empleado.getPagaExtra(1000, 5));
		System.out.println(gerente.getPagaExtra(1000, 15));
		System.out.println(director.getPagaExtra(1000, 25));
		
		
		
	}
	
	

}
