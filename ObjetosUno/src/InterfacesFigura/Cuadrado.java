package InterfacesFigura;

public class Cuadrado implements Figuras {

	private double lado;
	private boolean completo;
	
	public void setLado(double lado) {
		this.lado = lado;
		
	}
	
	public double getLado () {
		return this.lado;
	}
	
	public Cuadrado(double lado) {
		this.setLado(lado);
		this.completo = true;
		
	}

	
	public double perimetro() {	
	double perimetro = lado * 4;
		return perimetro;
	}

	
	public double area() {
		return Math.pow(lado, 2);
	}
	
	public boolean cuadradoCompleto() {
		return this.completo;
	}

}
