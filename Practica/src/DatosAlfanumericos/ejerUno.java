package DatosAlfanumericos;

/*
 * 1. Determinar si un car�cter es un digito num�rico 
 * (funci�n esDigito(char c)).
 * 2. Determinar si un car�cter es una letra (funci�n esLetra(char c)).
 * 3. Determinar si un car�cter es una letra may�scula o min�scula (funci�n esMayuscula(char c) y esMinuscula(char c)).
 * 4. Determinar la longitud de una cadena (funci�n longitud)
 * 5. Determinar si una cadena es vac�a (funci�n esVacia)
 * 6. Concatenar dos cadenas (funci�n concatenarCadena)
 





 */
 

public class ejerUno {
	public char d;
	public String c;
	private Object f;
	
	
public ejerUno (char d) {
	this.d = d; 
}

public ejerUno(String c) {
	this.c = c;
}

public  void esDigito ()
{
	if (Character.isDigit(this.d)) 
		System.out.println("Es un numero");
	else
		System.out.println("No es un numero");	
}

public void esLetra () {
	if (Character.isAlphabetic(this.d))
		System.out.println("Es una Letra");
	else
		System.out.println("No es una Letra");
}

public void esMinuscula () {
    if(Character.isLowerCase(this.d))
    	System.out.println("Minuscula" );
    else 
    	System.out.println("No es minuscula");
}

public void esMayuscula () {
    if(Character.isUpperCase(this.d))
    	System.out.println("Mayuscula");	
    else
    	System.out.println("No es mayuscula");
}

public void longitudDeCadena() {	
	 System.out.println("La cantidad de caracteres es " + c.length());
}

public void esVacia() {
	if (c.length() == 0)
	System.out.println("La cadena esta vacia");
		
}






  







}
