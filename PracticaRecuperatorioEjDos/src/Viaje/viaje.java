package Viaje;

public class viaje {
	
	private Integer escala;

	public Integer getEscala() {
		return escala;
	}

	public void setEscala(Integer escala) {
		this.escala = escala;
	}
	
	public viaje (Integer escala) {
		this.setEscala(escala);
	}


	@Override
	public String toString() {
		return "viaje [Escala= " + escala + "]";
	}

	
	
	
}

