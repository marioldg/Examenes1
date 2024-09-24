package biblioteca;

import java.util.ArrayList;

public class Libro {
	private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
	private String titulo;
	private boolean prestado;
	private String cliente;// para guardar el cliente actual del libro

	public Libro(String titulo, ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
		this.titulo = titulo;
		this.prestado = false;
		this.cliente = null;
	}
	
	

	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Prestamo finalizarPrestamo(Fecha fechaFin, Fecha inicio, String nombreCliente) {
		int ultimoPrestamo = listaPrestamos.size() - 1;
		// si el libro lo tiene alguien y ha sido prestado alguna vez
		if (listaPrestamos.get(ultimoPrestamo).getFechaFin() != null) {
			return null;
		} else {
			listaPrestamos.get(ultimoPrestamo).setFechaFin(fechaFin);
			cliente = null;
			prestado = false;
			return listaPrestamos.get(ultimoPrestamo);

		}
	}

	public Prestamo iniciarPrestamo(String nombreCliente, Fecha fechaInicio) {
		int ultimoPrestamo = listaPrestamos.size() - 1;
		// si el libro lo tiene alguien y ha sido prestado alguna vez
		if (listaPrestamos.get(ultimoPrestamo).getFechaFin() == null && !listaPrestamos.isEmpty()) {
			return listaPrestamos.get(ultimoPrestamo);
		} else {
			Prestamo prestamo1 = new Prestamo(nombreCliente, fechaInicio);
			listaPrestamos.add(prestamo1);
			cliente = nombreCliente;
			prestado = true;
			return prestamo1;
		}

	}
}
