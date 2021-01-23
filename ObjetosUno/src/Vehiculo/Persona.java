package Vehiculo;

public class Persona {
	
	/* 
	 * 1 Definimos Persona 
	 */
	private long dni;
	private String nombre;
	private String apellido;
	
	public Persona(long dni, String nombre, String apellido) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	/*
	 * Generamos Geters y seter
	 * Constructor para dni
	 */
	public Persona(long dni) {
		this(dni, "-", "-");
	}
	
	public long getDni() {
		return this.dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return this.getDni() + ", " + this.getNombre() + ", " + this.getApellido();
	}

}
