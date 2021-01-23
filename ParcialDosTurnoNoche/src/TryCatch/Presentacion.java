package TryCatch;

public class Presentacion {
	public static void main(String[] args) {
		System.out.println("Pantalla Encender");
	

	try {
		System.out.println("Titulo.mostrar");
		// ArithmeticException Lanza muestra "paso 3" por pantalla
		System.out.println("contenido.desplegar");
		//int a = 10/0;
		Object b = null;
		b.toString();
		System.out.println("video.reproducir");
		System.out.println("cuestionario.preguntar");
		
	}catch(ArithmeticException se) {
		System.out.println("No se encontro NOMBRE VIDEO" );
	}catch(Exception e) {
		System.out.println("Usuario + USUARIO + no autorizado");
		
	}finally {
		System.out.println("video ocultar");
	}
	
	System.out.println("Pantalla apagar");
	
	}    
	
}
