package CasaInteligente;

public class Televisores extends DispositivosInteligentes {
	private int volumen;
	
	 public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public Televisores(String marca, String ubicacion, String tipo, boolean estado) {
		super(marca, ubicacion, tipo, estado);
		
	}
	
	@Override
	public String toString() {
		String representar = "----------------------------" + "\n";
		representar += super.toString() + "\n" + "Estado: ";
		representar += (this.getEstado() == true)? "ENCENDIDO" : "APAGADO";
		
		return representar;
	}
	
	
	
}
