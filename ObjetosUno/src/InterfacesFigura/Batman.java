package InterfacesFigura;

public class Batman {
	int Squares = 81;
	public static void main(String[] args) {
		new Batman ().go();
	}
	void go() {
		incr(++Squares);
		System.out.println(Squares);
	}
	void incr (int squares) {
		squares += 10;
	}

}
