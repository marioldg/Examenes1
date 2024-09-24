package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro> listaLibros = new ArrayList<>();
	ArrayList<Libro> prestados = new ArrayList<>();
	ArrayList<Libro> librosPrestadosEnFecha = new ArrayList<>();

	public Libro[] librosPrestados() {

		//recorrer lista de libros y si esta prestado añadir a nuevo arrayList
		for (int k = 0; k < listaLibros.size(); k++) {
			if (listaLibros.get(k).isPrestado()) {
				prestados.add(listaLibros.get(k));
			}
		}
		return prestados.toArray(listaLibros.toArray(new Libro[0]));
	}

	public String cliente(Libro libro) {
		return libro.getCliente();
	}

}
