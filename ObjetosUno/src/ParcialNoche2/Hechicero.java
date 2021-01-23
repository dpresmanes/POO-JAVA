package ParcialNoche2;

public class Hechicero extends Personaje {

	@Override
	protected void jugar() {
		System.out.println("LANZA HECHIZO");	
	}
	
	protected void despuesDeJugar() {
		System.out.println("GANA EXPERIENCIA");
	}

}
