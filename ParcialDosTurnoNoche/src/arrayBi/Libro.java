package arrayBi;

public class Libro {
private Integer libro;

public Integer getLibro() {
	return libro;
}

public void setLibro(Integer libro) {
	this.libro = libro;
}

public boolean equals (Object p) { 
	return this.getLibro().equals(((Libro)p).getLibro());
}

@Override
public String toString() {
	return "Libro [libro=" + libro + "]";
}


public Libro (Integer libro) {
	this.setLibro(libro);
}
}
