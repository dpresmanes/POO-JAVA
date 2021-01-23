package Vehiculo;

public class Autobus extends Vehiculo{
	
	public static final int CANT_MAX_PASAJERO = 24; 
	private Persona [] pasajeros;
	/*numero de pasajeros*/
	int Size;
	
	public Autobus (Persona chofer, double cantKm) {
		super (chofer, cantKm);
		this.setPasajeros(new Persona[24]);
		this.setSize(0);
	}

	public Persona[] getPasajeros() {
		return this.pasajeros;
	}

	public void setPasajeros(Persona[] pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}
	
	/*
	 * Utilizamos un metodo boolean para agregar pasajeros
	 */

	public  boolean agregarPasajero(Persona pasajeros) {
		if(pasajeros == null) return false;
		if(this.getSize() == Autobus.CANT_MAX_PASAJERO) return false;
		this.getPasajeros()[this.getSize()] = pasajeros;
		this.setSize(this.getSize()+1);
		return true;
	}
	
	/* Metodo que Utilizamos para cambiar chofer */
	public void setChofer(Persona chofer) {
		/* Para poder cambiar el choder la cantidad de 
		 * pasajeros debe ser 0 */
		if(this.getSize() == 0);
		super.setChofer(chofer);
		 
	}
	
}


