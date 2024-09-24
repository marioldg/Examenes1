package alumno;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<String> listaModulos = new ArrayList<>();
	private boolean modulo;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}


	public boolean isModulo() {
		return modulo;
	}

	public void setModulo(boolean modulo) {
		this.modulo = modulo;
	}
	
	//si en la lista de modulos esta esa persona falso sino añades modulos
	
	public boolean matricular(String modulo) {
			if(listaModulos.contains(nombre)){
				return false;
			}else {
				return true && listaModulos.add(modulo);
			}
		}
	//si la lista contiene modulo lo borras.
	public boolean desmatricular(String modulo) {
			if(listaModulos.contains(modulo)) {
				return true && listaModulos.remove(modulo);
			}else {
				return false;
			}
		
	}
	//si esta matriculado true sino false
	public boolean estaMatriculado(String modulo) {
		return listaModulos.contains(modulo);

	}
	
	}


