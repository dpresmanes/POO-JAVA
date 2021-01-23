package VehiculoDos;

public class Motocicleta extends Vehiculo {
	
	private Persona acompaniante;
	
	public Motocicleta(Persona chofer, double cantKm, Persona acompaniante) {
		super(chofer, cantKm);
		this.setAcompaniante(acompaniante);
	}
	
	public Motocicleta(Persona chofer, double cantKm) {
		this(chofer, cantKm, null);
	}

	public Persona getAcompaniante() {
		return this.acompaniante;
	}

	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}
	
	public void setChofer(Persona chofer) {
		if (this.getAcompaniante() == null)
			super.setChofer(chofer);
	}
	
	public String toString() {
		String representacion = "-----------------------------" + "\n";
		representacion += super.toString() + "\n" + "Acompaniante: ";
		representacion += (this.getAcompaniante() == null)? "Sin acompaniante" : this.getAcompaniante().toString();
		representacion += "\n" + "-----------------------------" + "\n";
		return representacion;
	}
	
}