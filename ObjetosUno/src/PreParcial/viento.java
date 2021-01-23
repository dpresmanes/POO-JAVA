package PreParcial;

public class viento extends InstrumentosMusicales implements Interface {
	
	private String tipo;
	
	public viento(String nombre, String descripcion,String tipo) {
		super(nombre, descripcion);	
		this.setTipo(tipo);
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void AfinarInstrumento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LustrarInstrumento() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
