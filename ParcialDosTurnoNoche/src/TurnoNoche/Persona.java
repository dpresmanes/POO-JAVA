package TurnoNoche;
import java.util.*;

public class Persona {

	private String nombre;
	private Integer edad;
	private Integer hijos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getHijos() {
		return hijos;
	}
	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}
	
	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Edad=" + edad + ", Hijos=" + hijos + "]";
	}
	
	public Persona (String nombre, Integer edad, Integer hijos) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHijos(hijos);
		
	}
	
	  
	
	
	
	
}
