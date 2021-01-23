package arrayBi;

public class ListaLibros {

	Libro libros [][];
	
	public ListaLibros () {
		this.libros = new Libro[1][5];
		
	}
	
	public void AgregarLibros(int posicion, int posicion2,Libro libro ) {
		if (posicion>=0 && posicion<2 && posicion2>=0 && posicion2<5) {
			libros[posicion][posicion2] = libro ;
			
		}
		
	}
	
	public void mostrarLista() {
		for (int i=0; i<libros.length; i++) {
			for(int j=0; j<libros[i].length; j++) {
				System.out.println(libros[i][j]);
			}
		}
		
	} 
	

public <Libro> Integer contar(Libro libros[][], Libro libroToCount) {
	Integer cont = 0;
	for (int i=0; i<libros.length; i++) {
		for(int j=0; j<libros[i].length; j++) {
			if(libros[i][j].equals(libroToCount)) {
				cont++;
			}
		}
	}
	return cont;
}
	
}