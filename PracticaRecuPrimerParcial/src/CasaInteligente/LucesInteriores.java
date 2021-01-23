package CasaInteligente;

public class LucesInteriores extends DispositivosInteligentes {

	public LucesInteriores( String ubicacion, String tipo, boolean estado2) {
		super(null, ubicacion, tipo, estado2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String representar = "----------------------------" + "\n";
		representar += super.toString() + "\n" + "Estado: ";
		representar += (this.getEstado() == true)? "ENCENDIDO" : "APAGADO";
		
		return representar;
	}
	

}
