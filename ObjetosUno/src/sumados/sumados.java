package sumados;

import java.util.Scanner;

public class sumados {
	private int [] numeros;
	
	public  sumados(int n) {
		this.numeros=new int[n];
	}
	
	
	public void leerNumeros() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ingrese un valor entre 0 y 100");
		
		int leido=sc.nextInt();
		
		
		while (leido>=0) {
			
			this.numeros[leido]++;
			System.out.println("Ingrese un valor entre 0 y 100");
			leido = sc.nextInt();
		}
	}
	
	public int obtenerPosicion(int i) {
		return this.numeros[i];
	}


	

}
