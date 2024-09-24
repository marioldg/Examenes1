package hotel;

import java.util.ArrayList;

public class Hotel {
	private ArrayList<Habitacion> habitaciones = new ArrayList<>();
	private ArrayList<Habitacion> habitacionesLibres = new ArrayList<>();

	public Hotel(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public boolean añadir(Habitacion h) {
		for (Habitacion habPuntero : habitaciones) {
			if (habPuntero.getNumero() != h.getNumero()) {
				habitaciones.add(h);
			}
		}

		if (habitaciones.contains(h)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean borrar(int numero) {
		for (Habitacion habPuntero : habitaciones) {
			if (habPuntero.getNumero() == numero) {
				habitaciones.remove(habPuntero);
				return true;
			}
		}
		return false;
		

	}

	public double totalMetros() {
		double k = 0;
		for (Habitacion habPuntero : habitaciones) {
			k = k + habPuntero.getMetros();
		}
		return k;
	}

	public boolean reservar(int numero) {
		for (Habitacion habPuntero : habitaciones) {
			if (habPuntero.getNumero() == numero && habPuntero.isReservada() == false) {
				habPuntero.isReservada();
				return true;
			}

		}
		return false;
	}

	public boolean anular(int numero) {
		for (Habitacion habPuntero : habitaciones) {
			if (habPuntero.getNumero() == numero && habPuntero.isReservada() == true) {
				habPuntero.setReservada(false);
				return true;

			}
		}
		return false;
	}
	
	public int buscar1(double metrosMinimo,boolean banio) {
		int k= 0;
		for (Habitacion habPuntero : habitaciones) {
			if(habPuntero.isReservada()==false && habPuntero.isBanio()== banio && habPuntero.getMetros()>=metrosMinimo){
				k++;
			}
		}
		return k;
	}
	
	public int [] buscarN (double metroMinimo,boolean banio,int cuantas) {
		
		for (Habitacion habPuntero : habitaciones) {
			if(habPuntero.isReservada()==false && habPuntero.isBanio()== banio && habPuntero.getMetros()>=metroMinimo){
				habitacionesLibres.add(habPuntero);
			}
	}
		  int[] habitacionesDisponibles = new int[habitacionesLibres.size()]; //convierto my arraylist en array
		    for (int i = 0; i < habitacionesLibres.size(); i++) {
		        habitacionesDisponibles[i] = habitacionesLibres.get(i).getNumero();
		    }

		    return habitacionesDisponibles;
		}

		

	}
	
	

