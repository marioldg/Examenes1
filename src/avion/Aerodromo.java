package avion;

import java.util.ArrayList;
import java.util.List;

public class Aerodromo {

	private ArrayList<AvionRegular> avionesRegulares;

	public ArrayList<AvionRegular> getAvionesRegulares() {
		return avionesRegulares;
	}

	public void setAvionesRegulares(ArrayList<AvionRegular> avionesRegulares) {
		this.avionesRegulares = avionesRegulares;
	}


	public String masAsientos(ArrayList<AvionRegular> listaAvioncinos) {

		AvionRegular avionMasOcupado = listaAvioncinos.get(0);
		for (AvionRegular av : listaAvioncinos) {
			if (av.getNumeroAsientos() > avionMasOcupado.getNumeroAsientos()) {
				avionMasOcupado = av;
			}
		}
		return avionMasOcupado.getNombre();
	}

	public List<String> getAviones1950(ArrayList<AvionRegular> listaAvioncinos) {

		List<String> lista = new ArrayList<>();//creo nuevo array para añadir aviones mayores de 1950

		for (AvionRegular av : listaAvioncinos) {
			if (av.getAnio() > 1950) {
				lista.add(av.getNombre());
			}
		}
		return lista;
	}


	// Una lista que devuelve el nombre de los aviones cuya compañia sea Volotea
	
	public List<String> listaVolotea(ArrayList<AvionRegular> listaAviones) {
		List<String> PP = new ArrayList<>();
		for (AvionRegular av : listaAviones) {
			if ("Volotea".equals(av.getCompañia())) {
				PP.add(av.getNombre());
			}
		}
		return PP;
	}
	
	
	// Metodo que devuelva el avion mas caro

	public String avionMasCaro(ArrayList<AvionCarga> avionesCarga, ArrayList<AvionRegular> avionesRegulares) {
		AvionCarga avionCuestaMasCarga = avionesCarga.get(0);
		AvionRegular avionCuestaMasRegular = avionesRegulares.get(0);
		//avion carga mas caro
		for (AvionCarga av : avionesCarga) {
			if (av.getPrecio() > avionCuestaMasCarga.getPrecio()) {
				avionCuestaMasCarga = av;
			}
		}
		//avion regular mas caro
		for (AvionRegular av : avionesRegulares) {
			if (av.getPrecio() > avionCuestaMasRegular.getPrecio()) {
				avionCuestaMasRegular = av;
			}
		}
		//comparas ambos aviones y sacas el mas caro
		if(avionCuestaMasCarga.getPrecio()>avionCuestaMasRegular.getPrecio()) {
			return avionCuestaMasCarga.getNombre();
		}else {
			return avionCuestaMasRegular.getNombre();
		}

	}
}
