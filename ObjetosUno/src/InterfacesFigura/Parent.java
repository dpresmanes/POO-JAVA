package InterfacesFigura;

public class Parent {
	public Parent ( int x) {
		System.out.println("A");
	}

}

class Child extends Parent {
	public Child (int x ) {
		System.out.println("B");
	}
	public Child() {
		this(123);
		System.out.println("C");
	}
	public static void main(String[] args) {
		new Child();
	}
}
