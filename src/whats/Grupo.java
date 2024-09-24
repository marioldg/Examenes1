package whats;

import java.util.ArrayList;

public class Grupo {
	private ArrayList<Persona> personas = new ArrayList<>();
	private ArrayList<Persona> admins = new ArrayList<>();

	public Grupo(Persona administrador) {
		personas.add(administrador);
		administrador.setAdministrador(true);
		admins.add(administrador);

	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public void addPersona(Persona p) {
		 boolean repetido = false;
		for(Persona persPuntero : personas) {
			if (persPuntero.getNumero() == p.getNumero()) {
				System.out.println("persona ya existente");
				repetido=true;
			} 
				
			}if(repetido!=true) {
				personas.add(p);
			}
		
		}
	

	public void deletePersona(String telefono) {
		for (Persona persPuntero : personas) {
			if (persPuntero.getNumero() == telefono) {
				personas.remove(persPuntero);
			} else if (persPuntero.getNumero() == telefono && persPuntero.isAdministrador()) {
				System.out.println("no se puede expulsar al administrador");
			} else {
				System.out.println("dicho telefono no pertenece al grupo");
			}
		}
	}

	public void setEstado(String telefono, boolean administrador) {
		boolean contieneAdmin = false;
		for (Persona persPuntero : personas) {
			if (persPuntero.getNumero() == telefono && persPuntero.isAdministrador() == true) {
				persPuntero.setAdministrador(false);
			} else if (persPuntero.getNumero() == telefono && persPuntero.isAdministrador() == false) {
				persPuntero.setAdministrador(true);
			} else if (persPuntero.isAdministrador()) {
				contieneAdmin = true;
				break;
			}
		}
		if (!contieneAdmin) {
			System.out.println("no se puede cambiar si solo existe un admin");
		}

	}

	public int pertenece(String telefono) {
		for (Persona persPuntero : personas) {
			if (persPuntero.getNumero() == telefono && persPuntero.isAdministrador() == false) {
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
	}
	public Persona[] miembros(){
		 return personas.toArray(personas.toArray(new Persona[0]));
	}
	

}
