package CasaInteligente;

public class Portones extends DispositivosInteligentes{

	public Portones( String ubicacion, String tipo, boolean estado2) {
		super(null, ubicacion, tipo, estado2);
	}
	
	
	@Override
	public String toString() {
		String representar = "----------------------------" + "\n";
		representar += super.toString() + "\n" + "Estado: ";
		representar += (this.getEstado() == true)? "Abierto" : "Cerrado";
		
		return representar;
	}
	
	
	

}
