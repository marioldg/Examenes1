package examenTeddy;

import java.util.List;

public class Ganaderia {
	private List<Vaca> vacas;

	public Ganaderia(List<Vaca> vacas) {
		this.vacas = vacas;
	}

	public String masLeche() {
		if (vacas.isEmpty())
			return "";
		Vaca maxLecheVaca = vacas.get(0);
		for (Vaca vaca : vacas) {
			if (vaca.getLeche() > maxLecheVaca.getLeche()) {
				maxLecheVaca = vaca;
			}
		}
		return maxLecheVaca.getNombre();
	}

	public String masPeso() {
		if (vacas.isEmpty())
			return "";
		Vaca maxPesoVaca = vacas.get(0);
		for (Vaca vaca : vacas) {
			if (vaca.getPeso() > maxPesoVaca.getPeso()) {
				maxPesoVaca = vaca;
			}
		}
		return maxPesoVaca.getNombre();
	}

	public String masTalla() {
		if (vacas.isEmpty())
			return "";
		Vaca maxTallaVaca = vacas.get(0);
		for (Vaca vaca : vacas) {
			if (vaca.getTalla() > maxTallaVaca.getTalla()) {
				maxTallaVaca = vaca;
			}
		}
		return maxTallaVaca.getNombre();
	}

	public String masLechePesoTalla() {
		if (vacas.isEmpty())
			return "";
		String maxNombre = "";
		int maxLeche = Integer.MIN_VALUE;
		int maxPeso = Integer.MIN_VALUE;
		int maxTalla = Integer.MIN_VALUE;
		for (Vaca vaca : vacas) {
			if (vaca.getLeche() > maxLeche || (vaca.getLeche() == maxLeche && vaca.getPeso() > maxPeso)
					|| (vaca.getLeche() == maxLeche && vaca.getPeso() == maxPeso && vaca.getTalla() > maxTalla)) {
				maxNombre = vaca.getNombre();
				maxLeche = vaca.getLeche();
				maxPeso = vaca.getPeso();
				maxTalla = vaca.getTalla();
			}
		}
		return maxNombre;
	}

	public String masconTopes(int topeLeche, int topePeso, int topeTalla) {
		if (vacas.isEmpty())
			return "";
		String maxNombre = "";
		int maxLeche = Integer.MIN_VALUE;
		int maxPeso = Integer.MIN_VALUE;
		int maxTalla = Integer.MIN_VALUE;
		for (Vaca vaca : vacas) {
			int leche = vaca.getLeche() > topeLeche ? topeLeche : vaca.getLeche();
			int peso = vaca.getPeso() > topePeso ? topePeso : vaca.getPeso();
			int talla = vaca.getTalla() > topeTalla ? topeTalla : vaca.getTalla();
			if (leche > maxLeche || (leche == maxLeche && peso > maxPeso)
					|| (leche == maxLeche && peso == maxPeso && talla > maxTalla)) {
				maxNombre = vaca.getNombre();
				maxLeche = leche;
				maxPeso = peso;
				maxTalla = talla;
			}
		}
		return maxNombre;
	}
	}
