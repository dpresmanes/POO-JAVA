package TestMap;

import java.util.HashMap;
import java.util.Map;

/*
 * Crear un diccionario (mapa) tal que 
 * a un dni lo corresponda el nombre de una persona
 */
public class TestMap {
	
	public static void main(String[] args) {
	 Map<Integer, String > personas = new HashMap <Integer, String>();
	 
	 //agregar elementos
	 
	 personas.put(1, "Lucas");
	 personas.put(2, "Pedro");
	 personas.put(3, "Matias");
	 personas.put(4, "Peter");
	 personas.put(5, "Peter");
	 
	 System.out.println(personas);
	 // eliminar un elemento
	 personas.remove(1);
	 personas.remove(2, "Pedro"); 
	 
	 //obtener el elemento 
	 
	 System.out.println(personas.get(4));
	 // esta vacio)
	 System.out.println(personas.isEmpty()); 
	 // Existe la clave?
	 System.out.println(personas.containsKey(1));
	 // Existe el elemento?
	 System.out.println(personas.containsValue("Pedro"));
	 // Todas las claves (Conjunto de claves )
	 System.out.println(personas.keySet());
	}

	
}
