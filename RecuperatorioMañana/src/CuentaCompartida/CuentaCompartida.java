package CuentaCompartida;

public class CuentaCompartida {
	private Consumo [] consumosComensal;
	
	public CuentaCompartida (int numeroDeComensales) {
		this.consumosComensal = new Consumo [numeroDeComensales];
	}
	
	public void agregarConsumo(int comensal, Consumo consumo ) {
		if(comensal>=0 && comensal < consumosComensal.length ) {
			consumosComensal[comensal] = consumo;
		}
		
	}
	
	public void MostrarTodosLosconsumos() {
		for(int i=0; i<consumosComensal.length; i++) {
			System.out.println(consumosComensal[i]);
		}
	}
	
	
	public void importeXpersona (int comensal)
	{			
		System.out.println(consumosComensal[comensal]);
	}
	
	
	public void CalcularConsumoMáximo() {
		double max = 0;
		int persona = 0;
		for(int i=0; i<consumosComensal.length; i++) {
			if (consumosComensal[i].getPrecio()>max) {
			 max = consumosComensal[i].getPrecio();
			}		
		}
		System.out.println("El consumo mas alto fue " + max);
		System.out.println();
	}
	
		public void importeTotal() {
			double total = 0;
			for(int i=0; i<consumosComensal.length; i++) {
				total += consumosComensal[i].getPrecio();
			}
			System.out.println("El Total Fue: "+total);
		}
		
}
