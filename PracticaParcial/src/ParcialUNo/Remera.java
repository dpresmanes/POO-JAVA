package ParcialUNo;

public class Remera {
	private int talle;
	private double precio;

/*talle est� en el intervalo [0,7]
*/
public Remera(double precio, int talle){
this.precio=precio;
this.talle=talle;
}

public double obtenerPrecio(){
return this.precio;
}

public int obtenerTalle(){
return this.talle;
}
}
