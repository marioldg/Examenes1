package examenEmpleado;

public class Director extends Gerente {

	private boolean secretaria;

	public Director(String codEmpleado, int salarioBase, String departamento, int nivelPuesto, boolean secretaria) {
		super(codEmpleado, salarioBase, departamento, 20);
		this.secretaria = secretaria;

	}

	public boolean isSecretaria() {
		return secretaria;
	}

	public void setSecretaria(boolean secretaria) {
		this.secretaria = secretaria;
	}
	
	
	

}
