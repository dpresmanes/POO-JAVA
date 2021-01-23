package Vehiculo;

public class Motocicleta extends Vehiculo {
	
	private Persona acompaniante;
	
	/* Los constructores no se Heredan de las superclases,
	  pero si se pueden invocar desde la subClase a la super clase
	  tal es el caso de la Sub clase Motocicleta donde utilizamos los 
	  atributos de la clase Vehiculo la cual es abstracta */
	
	public Motocicleta (Persona Chofer, double cantidadKm, Persona acompaniante) {
		super (Chofer,cantidadKm);
		this.setAcompaniante(acompaniante);

}

	/* En este constructor no utilizamos Super ya que 
	 * en una sola sentencia lo estariamos resolviendp
	 * Dicho contructor llama al constructor de arriba	 
	 */
	public Motocicleta(Persona chofer, double cantidadKm) {	
		this (chofer, cantidadKm,null); //utilizamos Null ya que no hay acompañante//
	}
	public Persona getAcompaniante() {
		return this.acompaniante;
	}

	
	/*
	 * Utilizamos setAcompaniante para agregar acompaniante. 
	 */
	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}

	public void setChofer(Persona chofer) {
		if (this.getAcompaniante() == null)
			super.setChofer(chofer);
	}
	
}