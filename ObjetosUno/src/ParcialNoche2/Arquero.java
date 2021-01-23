package ParcialNoche2;

public class Arquero extends Personaje {

	protected void antesDeJugar() {
	System.out.println("TOMA UNA FLECHA");
		
	}
	@Override
	protected void jugar() {
		System.out.println("DISPARA");
		
	}
	
	

}
