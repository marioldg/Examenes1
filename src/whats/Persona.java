package whats;

public class Persona {
	private String numero;
	private String nombre;
	private boolean administrador;
	
	public Persona(String numero, String nombre) {
		
		this.nombre=nombre;
		this.numero=numero;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

}
