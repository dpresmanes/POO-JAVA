package arrayBi;

public class Array {
 public static void main(String[] args) {
	 
	Libro libro1 = new Libro (12);
	Libro libro2 = new Libro (13);
	Libro libro3 = new Libro (24);
	Libro libro4 = new Libro (13);
	Libro libro = new Libro (12);
	
	ListaLibros uno = new ListaLibros();
	
	uno.AgregarLibros(0, 0, libro1);
	uno.AgregarLibros(0, 1, libro2);
	uno.AgregarLibros(0, 2, libro3);
	uno.AgregarLibros(0, 3, libro4);
	uno.AgregarLibros(0, 4, libro);
	
	uno.mostrarLista();
	
	 uno.mostrarLista();
	
	
	
	
	
	
	
}
}
