package ArreglosString;



public class Cadena {
	private String cadena;
	
	public Cadena (String cadena) {
		this.setCadena(cadena);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
public static void  mostrarArreglo (Cadena[] palabras) {
		
		for (int i = 0; i < palabras.length; i++) 		
			System.out.println(palabras[i].getCadena()); 			
		
	} 

public static void mostrarArregloDadoVuelta(Cadena[] palabras) {
	for (int i=palabras.length-1;i>=0;i--)
		System.out.println(palabras[i].getCadena());
}
}
