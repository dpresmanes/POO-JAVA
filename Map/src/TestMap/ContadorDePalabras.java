package TestMap;
import java.util.Map;
import java.util.HashMap;
/*
 * Dado un array de palabras, contar
 * cuantas veces aárece cada palabra, y almacenar
 * los reultados en un diccionario
 */

public class ContadorDePalabras {
	public static void main(String[] args) {
		String[] palabras = new String[] {"perro", "gato","lagartija","perro","foca","pez"};
		Map<String, Integer> repeticiones = new HashMap<String, Integer>();
		
		for(int k = 0; k < palabras.length; k++) {
			//Existe la palabra?(clave)
			if (repeticiones.containsKey(palabras[k])) {
				repeticiones.put(palabras[k], repeticiones.get(palabras[k])+1);
			}else {
				repeticiones.put(palabras[k], 1);
			}
			
		}
	}
		

}
