import java.util.LinkedList;
import java.util.List;

public class TestLista {
	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		System.out.println("Esta vacia?: " + lista.isEmpty());
		lista.add(2);
		lista.add(1, 5);
		lista.add(3);
		System.out.println("toString: " + lista);
		lista.remove(1);
		System.out.println("toString: " + lista);
		System.out.println("Esta vacia?: " + lista.isEmpty());
		System.out.println("Elemento en pos 1?: " + lista.get(1));
		System.out.println("Tamaño de la lista: " + lista.size());

	}

}
