package examenCasa;

public class Main {

	public static void main(String[] args) {
		
		Casa casa1 = new Casa(5, 4);
		casa1.abrirPuerta();
		casa1.cerrarPuerta();
		casa1.abrirPuerta();
		casa1.abrirVentana(2);
		casa1.cerrarVentana(2);
		casa1.meterGato();
		casa1.meterGato();
		casa1.meterGato();
		casa1.sacarGato();
		casa1.meterPersona();
		System.out.println(casa1.getEstadoCasa().getGatosCaben()+" "+casa1.getEstadoCasa().getGatosDentro());
	}

}
