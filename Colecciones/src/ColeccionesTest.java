import java.util.Stack;

public class ColeccionesTest {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();
		System.out.println("Esta vacia?: " + pila.empty());
		pila.push(2);
		pila.push(5);
		pila.push(3);
		System.out.println("toString: " + pila);
		pila.pop();
		System.out.println("toString: " + pila);
		System.out.println("Esta vacio?: " + pila.empty());
		System.out.println("Elemento en el tope: " + pila.peek());

	}
}
