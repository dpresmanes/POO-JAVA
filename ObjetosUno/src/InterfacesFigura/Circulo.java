package InterfacesFigura;

public class Circulo implements Figuras {

	private double radio;
	private boolean completo;
	
	public double getRadio() {
		return this.radio;
	}
    
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public Circulo (double radio) {
		this.setRadio(radio);
		this.completo = true;
	}
	
	public double diametro() {
		return  2 * this.radio;
	}
	
	public double perimetro() {
		return Math.PI * this.diametro();
	}

	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public boolean circuloCompleto() {
		return this.completo;
	}
	
	
	

}
