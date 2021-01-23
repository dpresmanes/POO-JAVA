package TurnoNoche;
import java.util.*;

public class TestPersonas {
public static void main(String[] args) {

	ListaPersonas lista = new ListaPersonas();
	
	Persona a = new Persona("a",18,1);
	Persona b = new Persona("b",19,2);
	Persona c = new Persona("c",20,3);
	Persona d = new Persona("d",21,4);
	Persona e = new Persona("e",22,5);
	Persona f = new Persona("f",23,6);
	Persona g = new Persona("g",24,7);
	Persona h = new Persona("h",25,8);
	
	lista.agregarPersona(a);
	lista.agregarPersona(b);
	lista.agregarPersona(c);
	lista.agregarPersona(d);
	lista.agregarPersona(e);
	lista.agregarPersona(f);
	lista.agregarPersona(g);
	lista.agregarPersona(h);
	
	lista.mostrarPersonas();
	
	System.out.println(lista.getChildrenAverage(lista, 18, 20));
	
	 
	 
	 
}
}
