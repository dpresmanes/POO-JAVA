package Archivos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirPrintWriter {
public static void main(String[] args)	throws IOException {
		
		String miPath = "\\gus\\programas\\workspace\\";
		
		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"salida.out"));  //  preparo el arch de salida
	     
	    int z=50;
	    String s="dni:";
	    salida.print(s);      
		salida.println(" "+z); 
		salida.close(); //esto escribe : dni: 50

	}
}
