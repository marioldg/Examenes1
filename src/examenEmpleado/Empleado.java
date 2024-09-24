package examenEmpleado;

public class Empleado {

	private String codEmpleado;
	private double salarioBase;
	private String departamento;
	
	public Empleado(String codEmpleado, double salarioBase, String departamento){
		
		this.codEmpleado= codEmpleado;
		this.departamento = departamento;
		this.salarioBase = 1000;
		
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getPagaExtra(double salario, int nivel) {
		double extra = 0;
		if(nivel < 10) { //EMPLEADO
			extra = salario + (salario * 0.02);
			
		}
		else if(nivel >= 10 && nivel <= 20) { //GERENTE
			extra = salario + ((nivel * 0.01) * salario);   
		}
		
		else{
			
			extra = salario + 500 + ((nivel * 0.01) * salario);
		}
		
		return extra;
		

	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", salarioBase=" + salarioBase + ", departamento="
				+ departamento + "]";
	}
	

}
