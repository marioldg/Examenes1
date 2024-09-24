package examenCasa;

public class Casa {

	private int nVentanas;
	private int nHabitaciones;
	private boolean puerta;
	private boolean[] habitaciones;
	private boolean[] ventanas ;
	private int personas;
	private int gatos;

	public Casa(int nVentanas, int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
		this.nVentanas = nVentanas;
		this.puerta = false;
		this.personas = 0;
		this.ventanas = new boolean [Math.max (nVentanas, 1)];
		this.gatos = 0;

		if (nVentanas <= 0) {
			this.nVentanas = 1;
		}

		if (nHabitaciones <= 0) {
			this.nHabitaciones = 1;
		}

		for (int i = 0; i <this.ventanas.length; i++) {
			this.ventanas[i] = true;
		}

	}

	public boolean abrirVentana(int n) {
		for (int i = 0; i <= getVentanas().length; i++) {
			if (i == n && getVentanas()[i] == false) {
				getVentanas()[i] = true;
				return true;
			}
		}
		return false;
	}

	public boolean cerrarVentana(int n) {
		for (int i = 0; i <= getVentanas().length; i++) {
			if (i == n && getVentanas()[i] == true) {
				getVentanas()[i] = false;
				return true;
			}
		}
		return false;
	}

	public boolean abrirPuerta() {
		if (isPuerta() == false) {
			setPuerta(true);
			return true;
		} else {
			return false;
		}
	}

	public boolean cerrarPuerta() {
		if (isPuerta() == true) {
			setPuerta(false);
			return true;
		} else {
			return false;
		}
	}

	public boolean getOcupacion() {
		if (getPersonas() > 2 || getGatos() > 6 || getPersonas() >= 1 && getGatos() >= 3) {
			System.out.println("aforo completo");
			return false;
		} else {
			return true;
		}
	}

	public boolean meterPersona() {
		if (isPuerta() == false || getOcupacion() == false) {
			System.out.println("aforo completo");
			return false;
		} else {
			setPersonas(personas++);
			return true;
		}

	}

	public boolean sacarPersona() {
		if (isPuerta() == false || getPersonas() <= 0) {
			System.out.println("aforo vacio");
			return false;
		} else {
			setPersonas(personas--);
			return true;
		}
	}

	public boolean meterGato() {
		
		for (int i = 0; i <= getVentanas().length; i++) {
			if (getOcupacion() == true && (isPuerta() == true || getVentanas()[i] == true)) {
				setGatos(getGatos()+1);
				return true;

			}
		}
		return false;
	}

	public boolean sacarGato() {
		for (int i = 0; i < getVentanas().length; i++) {
			if ((isPuerta() == false || getVentanas()[i] == false) && getGatos() <= 0) {
				System.out.println("no se pueden sacar gatos");
				return false;
			}

		}
		setGatos(getGatos()-1);
		return true;
	}
	
	public EstadoCasa getEstadoCasa() {
		EstadoCasa estC1 = new EstadoCasa(puerta, ventanas, personas, gatos, gatos, personas);
		return estC1;
		
	}

	public int getGatos() {
		return gatos;
	}

	public void setGatos(int gatos) {
		this.gatos = gatos;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public int getnVentanas() {
		return nVentanas;
	}

	public void setnVentanas(int nVentanas) {
		this.nVentanas = nVentanas;
	}

	public int getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

	public boolean isPuerta() {
		return puerta;
	}

	public void setPuerta(boolean puerta) {
		this.puerta = puerta;
	}

	public boolean[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(boolean[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public boolean[] getVentanas() {
		return ventanas;
	}

	public void setVentanas(boolean[] ventanas) {
		this.ventanas = ventanas  ;
	}

}
