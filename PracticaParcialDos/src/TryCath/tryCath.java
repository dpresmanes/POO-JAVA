package TryCath;


public class tryCath {
public static void main(String[] args) {
	
	try {
		System.out.println("Paso1");
		int a = 10/0; // ArithmeticException Lanza muestra "paso 3" por pantalla
		System.out.println("Paso2");	
		
	}catch(ArithmeticException se) {
		System.out.println("Paso3");
	}catch(Exception e) {
		System.out.println("paso4 ");
	}
	
	try {
		System.out.println("paso5");
		int a = 10/1; // no lanza ninguna excepcion
		System.out.println("paso6");
		Object b = null;
		b.toString(); //lanza Paso9 NullPointerAcces
 		System.out.println("paso7");
		
	}catch(ArithmeticException se) {
		System.out.println("paso8");
		
	}catch(Exception e) {
		System.out.println("Paso9");
	}
	
}
	
}
