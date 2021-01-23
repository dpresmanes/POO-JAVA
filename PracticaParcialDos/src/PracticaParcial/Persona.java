package PracticaParcial;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

public class Persona    {
	
	private Integer dni;
	private String apellido;
	private Integer edad;
	private Integer hijos;
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	public Persona(Integer dni, String apellido, Integer edad) {
		this.setDni(dni);
		this.setApellido(apellido);
		this.setEdad(edad);
	}
	
	/*
	 *Realiza el equals correctamente pero no sobre
	 *escribe  
	 *public boolean equals( Persona p) {
		return this.getDni().equals(p.getDni());
	}
	 */
	
	//Sobre Escribe //
	
	
	@Override
	public boolean equals( Object p) {
		return this.getDni().equals(((Persona)p).getDni());
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	/*Metodo Static que me devuelce
	 * una LinkedList.
	 * Utilizamos String Archivo como parametro
	 * Dentro de este estara la ruta del archivo
	 * luego sera utilizada por Scanner
	 *  para que lo pueda mostrar.
	 *  Utilizamos un Wild que se va ejecutar 
	 *  mientras tengamos un dato para leer
	 */
	
	
	//throws indica que el metodo getPersonas puede lanzar la exepcion
	//imposibleLeerArchivoException.
	//throw lanza una excepcion 
	//throws INDICA que un metodo "PODRIA" lanzar una exception.
	public static LinkedList <Persona> getPersonas(String archivo) throws imposibleLeerArchivoException {
		LinkedList <Persona> lista = new LinkedList<Persona>();	
		Scanner s = null;
		// Utilizamos Try Cath para manejar exepcion
		// al leer con Scanner.//
		
		try {	
			s= new Scanner(new File(archivo));
			
			//dni(entero) apellido(String) edad(entero)
			while(s.hasNext()) { //mientras haya un dato a ser leido	
				Persona p = new Persona(s.nextInt(), s.next(), s.nextInt());//De esta forma se va a leer el archivo
				lista.add(p);
			}
			
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			
		}finally {
			if(s != null) {
				s.close();
			}
			
		}
		
		return lista;
	}
	
	public static LinkedList <Persona> getPersonasMayoresAEdad(LinkedList<Persona> personas,Integer edad){
		LinkedList <Persona> lista = new LinkedList<Persona>();
	     
		for(Persona p: personas) {
			if(p.getEdad() < edad)
				lista.add(p);		
			
		}
		
		return lista;
	}
	
	public static  Integer TotalPersonas(LinkedList <Persona> persona){
		Integer total= 0;
		for(Persona p: persona) {
			total += p.getEdad();
		}
		if(total!=0)
		{
			total /= persona.size();
		}
		return total;  
		
	}
	
	public static  Integer muestraPersonasEdadProm(LinkedList <Persona> persona, Integer total) {
		Integer cont=0;
		for(Persona p: persona) {
			if(p.getEdad()>= total)
				cont++;
		}
		
		return cont;
	}
	
	
	public static LinkedList<Persona> EdadMasAlta (LinkedList<Persona> personas){
		Persona may = personas.getFirst();
		LinkedList <Persona> lista = new LinkedList<Persona>();
	    for (Persona p: personas) {
	     
	    		if( p.getEdad()>may.getEdad()) {
	    			may=p;
	    			lista.clear();
	    			lista.add(p);
	    	} else if(p.getEdad()== may.getEdad()) {
	    		lista.add(p);
	    	}
	    		 
	    		 
		}
	    
	    return lista;
		
	}
	
	public static LinkedList<Persona> EdadMasBaja (LinkedList<Persona> personas){
		Persona men = personas.getFirst();
		LinkedList <Persona> lista = new LinkedList<Persona>();
	    for (Persona p: personas) {     
	    		if( p.getEdad()<men.getEdad()) {
	    			men=p;
	    			lista.clear();
	    			lista.add(p);
	    	} else if(p.getEdad()== men.getEdad()) {
	    		lista.add(p);
	    	}
	    		 
	    		 
		}
	    
	    return lista;
		
	}
	
	
	
	

	
}





