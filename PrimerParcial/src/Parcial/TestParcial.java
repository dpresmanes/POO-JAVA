package Parcial;

public class TestParcial {
	public static void main(String[] args) {
		
		Remera[] remeras = new Remera [7];
		
		remeras [0] = new Remera (10, 0);
		remeras [1] = new Remera (15, 1);
		remeras [2]= new Remera (13, 2);
		remeras [3] = new Remera (14, 3);
		remeras [4] = new Remera (15, 4);
		remeras [5]= new Remera (16, 5);
		remeras [6]= new Remera (17, 6);
		
			for(Remera q : remeras)
			System.out.println(Stock.contarRemerasPorTalle(remeras, 10, 8));

	}		
}
