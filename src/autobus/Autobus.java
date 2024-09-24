package autobus;

public class Autobus {

	public int capacidad;
	public int pasajerosActuales;

	// Constructor de la clase Autobus
	public Autobus(int capacidad) {

		if (capacidad > 0) {
			this.capacidad = capacidad;

		} else {
			// asigna 45 a capacidad por defecto
			this.capacidad = 45;
		}

		this.pasajerosActuales = 0;
	}

	public int subir(int personas) {

		// Verificar si el número de personas es negativo (bajar personas)
		if (personas < 0) {
			// Calcular el número de personas que pueden bajar realmente
			int personasQueBajan;

			// Si personas menor que la cantidad de pasajeros actuales
			if (-personas < pasajerosActuales) {
				personasQueBajan = -personas;
			} else {
				// Si es mayor o igual, todos los pasajeros bajan
				personasQueBajan = pasajerosActuales;
			}

			// Actualizar el número de pasajeros actuales
			pasajerosActuales = pasajerosActuales + personasQueBajan;

			// Retornar el número de personas que bajaron (negativo)
			return -personasQueBajan;

		} else {
			// Calcular el número de personas que pueden subir realmente
			int plazasDisponibles = capacidad - pasajerosActuales;
			int personasQueSuben;

			// Si la cantidad de personas que suben es menor que las plazas disponibles
			if (personas < plazasDisponibles) {
				personasQueSuben = personas;
			} else {
				// Si es mayor o igual, solo pueden subir hasta las plazas disponibles
				personasQueSuben = plazasDisponibles;
			}

			// Actualizar el número de pasajeros actuales
			pasajerosActuales = pasajerosActuales + personasQueSuben;

			// Retornar el número de personas que subieron
			return personasQueSuben;
		}
	}

	public int bajar(int personas) {

		// Verificar si el número de personas es negativo (subir personas)
		if (personas < 0) {
			// Calcular el número de personas que pueden subir realmente
			int personasQueSuben;

			// Si el valor absoluto de personas es menor que la cantidad de pasajeros
			// actuales
			if (-personas < pasajerosActuales) {
				personasQueSuben = -personas;
			} else {
				// Si el valor absoluto es mayor o igual, todos los pasajeros suben
				personasQueSuben = pasajerosActuales;
			}

			// Actualizar el número de pasajeros actuales
			pasajerosActuales = pasajerosActuales - personasQueSuben;

			// Retornar el número de personas que subieron (negativo)
			return -personasQueSuben;

		} else {
			// Calcular el número de personas que pueden bajar realmente
			int personasQueBajan;

			// Si la cantidad de personas que bajan es menor que la cantidad de pasajeros
			// actuales
			if (personas < pasajerosActuales) {
				personasQueBajan = personas;
			} else {
				// Si es mayor o igual, solo pueden bajar hasta la cantidad de pasajeros
				// actuales
				personasQueBajan = pasajerosActuales;
			}

			// Actualizar el número de pasajeros actuales
			pasajerosActuales = pasajerosActuales - personasQueBajan;

			// Retornar el número de personas que bajaron
			return personasQueBajan;
		}
	}

	public int pasajeros() {

		return pasajerosActuales;
	}

	public int plazasLibres() {
		// Calcular el número de plazas libres restando la cantidad actual de pasajeros
		// a la capacidad total
		int plazasLibres = capacidad - pasajerosActuales;

		// Retornar el número de plazas libres
		return plazasLibres;
	}

}




