package autobus;

public class Main {

	// Método main para probar la clase Autobus
	public static void main(String[] args) {
		// Crear un autobús con capacidad de 50
		Autobus miAutobus = new Autobus(50);

		// Subir 30 personas al autobús
		int personasSubidas = miAutobus.subir(30);
		System.out.println("Personas subidas: " + personasSubidas);
		System.out.println("Pasajeros actuales: " + miAutobus.pasajeros());
		System.out.println("Plazas libres: " + miAutobus.plazasLibres());

		// Bajar 15 personas del autobús
		int personasBajadas = miAutobus.bajar(15);
		System.out.println("Personas bajadas: " + personasBajadas);
		System.out.println("Pasajeros actuales: " + miAutobus.pasajeros());
		System.out.println("Plazas libres: " + miAutobus.plazasLibres());
	}
}
