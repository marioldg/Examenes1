package hotel;

public class Habitacion {
	private int numero;
	private double metros;
	private boolean banio;
	private boolean reservada;

	
	
	public Habitacion(int numero, double metros, boolean banio,boolean reservada) {
		this.banio= banio;
		this.metros=metros;
		this.numero = numero;
		this.reservada = reservada;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public int getNumero() {
		return numero;
	}

	public double getMetros() {
		return metros;
	}

	public boolean isBanio() {
		return banio;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public void setBanio(boolean banio) {
		this.banio = banio;
	}
	

}
