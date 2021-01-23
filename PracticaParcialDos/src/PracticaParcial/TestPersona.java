package PracticaParcial;
import java.io.FileNotFoundException;
import java.util.LinkedList;

public class TestPersona{

public static void main(String[] args) {
	//Persona p1 = new Persona (12345678,"Lucas",32 );
	//Persona p2 = new Persona (12345678,"Walter",46);
	
	
	try {
	LinkedList<Persona> miLista = Persona.getPersonas("personas.in");
	//LinkedList<Persona> miLista1 = Persona.getPersonasMayoresAEdad(miLista, 27);
   // Integer total = Persona.TotalPersonas(miLista);
	//LinkedList<Persona> miLista1 = Persona.EdadMasAlta(miLista);
	LinkedList<Persona> miLista2 = Persona.EdadMasBaja(miLista);
	
	for(Persona p: miLista2) { //for-each
	System.out.println(p); 
	
	}
	
	}catch(imposibleLeerArchivoException ex){
		System.out.println(ex.getMessage());
	}
	
	
	
	
}
}
