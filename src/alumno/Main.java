package alumno;

public class Main {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Pepe");
		
		System.out.println(a1.estaMatriculado("Pepe"));
		a1.matricular("Mates");
		System.out.println(a1.estaMatriculado("Mates"));
		a1.desmatricular("Mates");
		System.out.println(a1.desmatricular("Mates"));
	}

}
