package Parcial;

public class Stock {
	public static int[] contarRemerasPorTalle(Remera[] remeras,double precioDesde,double precioHasta){
		int[] arreglo = new int[remeras.length];
		for(int i = 0; i < remeras.length; i++) {
			if (remeras[i] != null) {
       		 	if (remeras[i].obtenerPrecio() >= precioDesde && remeras[i].obtenerPrecio()<=precioHasta);
       			arreglo[remeras[i].obtenerTalle()]++;
       			}
       	}
		
		return arreglo;
	}

}
