package ParcialNoche3;

public class Gerente {
	
	public static double[] main(String[] args) {
		

	public double[] sumarGastosMensuales(Gasto[] gastos) {
		double[] arregloDevuelto = new double[13];

       	for(int i = 0; i < gastos.length; i++) {
       		if (gastos[i] != null) {
       			arregloDevuelto[0] += gastos[i].obtenerImporte();
       			arregloDevuelto[gastos[i].obtenerMes()] += gastos[i].obtenerImporte();
       		}
       	}

    	return arregloDevuelto;
    }
	
	}
}
