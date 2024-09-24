package biblioteca;

public class Prestamo {

	private String nombreCliente;
	private Fecha fechaInicio;
	private Fecha fechaFin;

	public Prestamo(String nombreCliente,Fecha fechaInicio) {
		this.nombreCliente = nombreCliente;
		this.fechaFin = null;
		this.fechaInicio=fechaInicio;
	}


	public Fecha getFechaInicio() {
		return fechaInicio;
	}


	public Fecha getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(Fecha fechaFin) {
		this.fechaFin = fechaFin;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}

	
}
