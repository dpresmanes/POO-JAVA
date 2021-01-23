package TurnoNoche;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListaPersonas {
	private ArrayList<Persona> personas; 
	
	public ListaPersonas() {
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona e) {
		this.personas.add(e);
	}
	
	public void mostrarPersonas() {
		for(Persona p: this.personas) {
			System.out.println(p);
		}
	}
	
	public Double getChildrenAverage(ListaPersonas lista, Integer fromAge, Integer toAge) {
	  Double cont = 0.0;
	  Double acum = 0.0;
	  Double prom = 0.0;
	   for(Persona p: this.personas) {
			if(p.getEdad()>=fromAge && p.getEdad() == toAge) {
			cont++;
			acum += p.getHijos();
		} 	
	}
	   
	return acum/cont;
	   
	}
	
}
