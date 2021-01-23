package semanaCuatroMonedero;

public class Test {
	
public static void main(String[] args) {
		
		Monedero monederito = new Monedero(1000);
		
		monederito.ponerDinero(2000);
		System.out.println(monederito.consultarDineroDisponible());
		
		monederito.sacarDinero(400);
		monederito.ponerDinero(100);
		monederito.sacarDinero(2000);
		monederito.sacarDinero(100);
		System.out.println(monederito.consultarDineroDisponible());
		
	}

}
