package examenProgramacion;

public class Ganaderia {
	
	private Vaca [] misVacas;
	
	public Ganaderia(Vaca[] vacas){
		
		this.misVacas = vacas;
		
		if(vacas.length==0 || vacas==null) {
			misVacas = null;
		}

	}
	
	public String masLeche() {
		
		if(misVacas.length <= 0) {
			return null;	
		}
		//CREAMOS UNA VACA PARA COMPARAR CON EL RESTO MEDIANTE EL FOR
		Vaca vacaMaxLeche = misVacas[0];
		for(int i =0; i< misVacas.length; i++) {
			if(misVacas[i].getLeche()>=vacaMaxLeche.getLeche()) {
				vacaMaxLeche = misVacas[i];
			}
		}
		
		return vacaMaxLeche.getNombre();
	
	}
	
	public String masPeso() {
		
		Vaca vacaMaxPeso = misVacas[0];
		if (misVacas.length<=0) {
			return null;
		}
		
		for(int i=0; i < misVacas.length;i++) {
			if(misVacas[i].getPeso()>= vacaMaxPeso.getPeso()) {
				vacaMaxPeso = misVacas[i];
			}
		}
		
		return vacaMaxPeso.getNombre();
	}
	
	public String masTalla() {
		Vaca vacaMaxTalla = misVacas[0];
		
		if(misVacas.length<=0) {
			return null;
		}
		
		for (int i = 0; i< misVacas.length; i++) {
			if(misVacas[i].getTalla()>=vacaMaxTalla.getTalla()) {
				vacaMaxTalla = misVacas[i];
			}
		}
		
		return vacaMaxTalla.getNombre();
	}
	
	public String masLechePesoTalla() {
		int vacaMaxLeche = misVacas[0].getLeche();
		int vacaMaxTalla = misVacas[0].getTalla();
		int vacaMaxPeso = misVacas[0].getPeso();
		String nombreVacaMasLeche = misVacas[0].getNombre();
		
		for(int i =0; i< misVacas.length; i++) {
			if(misVacas[i].getLeche()>vacaMaxLeche ||
					(misVacas[i].getLeche() == vacaMaxLeche &&
					misVacas[i].getPeso() > vacaMaxPeso) ||
			(misVacas[i].getLeche()== vacaMaxLeche && misVacas[i].getPeso() == vacaMaxPeso &&
			misVacas[i].getTalla()>vacaMaxTalla)){
				
				nombreVacaMasLeche = misVacas[i].getNombre();
			}
		}
		
		return nombreVacaMasLeche;
		
	
	}
	
	

}


