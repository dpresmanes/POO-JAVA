package ArreglosUno;

import java.util.Arrays;

public class Arreglo {
	private int numeros;
	
	public Arreglo (int numeros) {
		this.setNumeros(numeros);
	}


	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
		  
	public static void  mostrarArreglo (Arreglo[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i].getNumeros()>=8 && numeros[i].getNumeros()<=14)
			System.out.println(numeros[i].getNumeros()); 			
		}
	} 
	
	public static void mostrarArregloDadoVuelta(Arreglo[] numeros) {
		for (int i=numeros.length-1;i>=0;i--)
			System.out.println(numeros[i].getNumeros());
	}

}
