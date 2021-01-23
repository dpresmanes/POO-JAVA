package sumados;

public class Test {
	
 public static void main(String[] args) {
	
	 sumados numi = new sumados(10);
	 numi.leerNumeros();
	 
	 for(int i=0; i<10; i++)
		 System.out.println(numi.obtenerPosicion(i));
}

}
