package PreParcial;

/*
 *  Todos los instrumentos se pueden tocar. Pero el funcionamiento de tocar un instrumento varía
dependiendo del instrumento que sea.
 */
public class InstrumentosMusicales {
	
	private String nombre;
	private String descripcion;
	
	public InstrumentosMusicales(String nombre, String descripcion) {
		this.setDescripcion(descripcion);
		this.setNombre(nombre);
		
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
