package termostato;

public class Main {

	public static void main3(String[] args) {
		
		Termostato termo = new Termostato(6);
		termo.setTemperaturaReal(3);
		termo.setTemperatura(35);
		termo.setTemperaturaDeseada(3);
		termo.getEstadoCaldera();
		System.out.println(termo.getEstadoCaldera());
		termo.setModo(0);
		termo.getEstadoCaldera();
		System.out.println(termo.getEstadoCaldera());
	}

}
