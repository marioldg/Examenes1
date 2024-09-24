package examenCasa;

public class EstadoCasa {
	
	private final boolean puertaAbierta;
	private final boolean [] ventanasAbiertas;
	private final int personasDentro;
	private final int gatosDentro;
	private final int gatosCaben;
	private final int personasCaben;
	
	public EstadoCasa(boolean puertaAbierta,boolean [] ventanasAbiertas,int personasDentro,int gatosDentro, int gatosCaben,int personasCaben) {
		this.gatosCaben=gatosCaben;
		this.gatosDentro=gatosDentro;
		this.personasCaben= personasCaben;
		this.personasDentro=personasDentro;
		this.puertaAbierta=puertaAbierta;
		this.ventanasAbiertas=ventanasAbiertas;
		
		
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public boolean[] getVentanasAbiertas() {
		return ventanasAbiertas;
	}

	public int getPersonasDentro() {
		return personasDentro;
	}

	public int getGatosDentro() {
		return gatosDentro;
	}

	public int getGatosCaben() {
		return gatosCaben;
	}

	public int getPersonasCaben() {
		return personasCaben;
	}

}
