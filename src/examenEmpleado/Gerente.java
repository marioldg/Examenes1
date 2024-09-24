package examenEmpleado;

public class Gerente extends Empleado {

	private int nivelPuesto;

	public Gerente(String codEmpleado, int salarioBase, String departamento, int nivelPuesto) {
		super(codEmpleado, salarioBase, departamento);
		this.nivelPuesto = 10;
	}

	public int getNivelPuesto() {
		return nivelPuesto;
	}

	public void setNivelPuesto(int nivelPuesto) {
		this.nivelPuesto = nivelPuesto;
	}

}
