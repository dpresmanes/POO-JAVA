package CuentaCompartida;

public class Test {
	
	public static void main(String[] args) {
		
		Consumo consumo1 = new Consumo("fideos", 100);
		Consumo consumo2 = new Consumo("milanesa", 200);
		Consumo consumo3 = new Consumo("ensalada", 300);
		Consumo consumo4 = new Consumo("papas", 400);
		Consumo consumo5 = new Consumo("lomo", 500);
		
	    CuentaCompartida uno = new CuentaCompartida(5);
		
	    uno.agregarConsumo(0, consumo1);
	    uno.agregarConsumo(1, consumo2);
	    uno.agregarConsumo(2, consumo3);
	    uno.agregarConsumo(3, consumo4);
	    uno.agregarConsumo(4, consumo1);
	    
	    //uno.MostrarTodosLosconsumos();
	    //uno.importeXpersona(3);
	    //uno.CalcularConsumoMáximo();
	    uno.importeTotal();
	}

}
