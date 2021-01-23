package Punto;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void setX (double x) {
		this.x = x;
	}
	
	public double getX () {
		return x;
	}
	
	public void setY (double y) {
		this.y = y;	
	}
	
	public double getY () {
		return y;
	}
	
	public boolean estaSobreX() {
		return (this.getY() == 0);
	}
	
	public boolean estaSobreY() {
		return (this.getX() == 0);
	}
	
	public boolean esElOrigen() {
		return this.estaSobreX() && this.estaSobreY();		
	}
	
	public static double distanciaEntrePuntos (Punto punto1, Punto punto2) {
		return Math.sqrt(Math.pow(punto1.x - punto2.x,2)+
				Math.pow(punto1.y-punto2.y,2));
		
	}
	
}
