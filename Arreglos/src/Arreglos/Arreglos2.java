package Arreglos;
//import javax.swing.*;


public class Arreglos2 {
public static void main(String[] args) {
	
	int[] numeros = new int [100];
	
	//Generamos un array de numeros aleatorios//
	
	for(int i=0; i<numeros.length;i++) {
		numeros[i] = (int)Math.round(Math.random()*100);
	}
	
	for(int i:numeros) {
		System.out.println(i);
	}
	
	//String[] paises= new String [8];
	
	//for(int i=0; i<paises.length; i++) {
	//	paises[i]=JOptionPane.showInputDialog("Introduce pa�s");
	//}
	
	//for(EACH) 
	//for(String i: paises) {	
	//System.out.println(i);		
	//}
}

}
