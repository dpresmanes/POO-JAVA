package PreParcial;

public class Metal extends viento {

	public Metal(String nombre, String descripcion,String tipo) {
		super(nombre, descripcion,tipo);	
	}

	@Override
	public void AfinarInstrumento() {
		if (this.getTipo()=="metal")
			System.out.println("Afinar Instrumento de Metal");
	}

	@Override
	public void LustrarInstrumento() {
		if (this.getTipo()=="metal")
			System.out.println("Afinar Instrumento de Metal");
	}
 

}
