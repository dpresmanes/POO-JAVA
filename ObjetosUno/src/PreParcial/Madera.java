package PreParcial;

public class Madera extends viento  implements Interface{

	public Madera(String nombre, String descripcion,String tipo) {
		super(nombre, descripcion, tipo);
	}
	
	
	

	@Override
	public void AfinarInstrumento () {
		if (this.getTipo()=="madera")
			System.out.println("Afinar Instrumento de Madera");
	}
	

	@Override
	public void LustrarInstrumento() {
		if (this.getTipo()=="madera");
		System.out.println("Lustrar Instrumento de Madera");	
	}


}
