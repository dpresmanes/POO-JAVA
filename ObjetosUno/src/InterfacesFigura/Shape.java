package InterfacesFigura;

public class Shape {
	private String color;
	public Shape(String color) {
		System.out.println("shape");
		this.color = color;
	}
	
	public static void main(String[] args) {
		new Rectangle();
	}

}

class Rectangle extends Shape {
	public Rectangle() {
		super ("Blue");
		System.out.println("Rectangle");
	}
}
