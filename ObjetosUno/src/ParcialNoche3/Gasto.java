package ParcialNoche3;

public class Gasto {

	private int mes;
	private double importe;
	
	public Gasto(int mes, double importe) {
		this.mes = mes;
		this.importe = importe;				
	}
	public int obtenerMes () {
		return this.mes;
	}
	public double obtenerImporte() {
		return this.importe;
	}
}
