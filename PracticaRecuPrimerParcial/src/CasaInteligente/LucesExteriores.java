package CasaInteligente;

public class LucesExteriores extends DispositivosInteligentes {
	

	
	public LucesExteriores(String ubicacion, String tipo, boolean estado2, boolean principal) {
		super(null, ubicacion, tipo, estado2);
		
		
	}
	
	@Override
	public String toString() {
		
	String representar = "----------------------------" + "\n";
	     representar +=  super.toString() + "\n" + "Estado: ";
	     representar += (this.getEstado() == true)? "ENCENDIDO" : "APAGADO";
			     
		return representar;
	}
	
	
	
	
	
}
