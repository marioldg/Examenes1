package whats;

public class Main {

	public static void main(String[] args) {
		Persona per1 = new Persona("531659", "Hugo");
		Persona per2 = new Persona("564983", "Paco");
		Persona per3 = new Persona("590104", "Pepe");
		
		Grupo grupo1 = new Grupo(per1);
		
		grupo1.addPersona(per2);
		grupo1.addPersona(per2);
		grupo1.addPersona(per3);
		Persona[] miembros;
		miembros = grupo1.miembros();
		for(Persona pers1 : miembros) {
			System.out.println(pers1.getNombre());
		}
		

	}

}
