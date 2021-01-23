package Viaje;
import java.util.LinkedList;

public class ListaEscalas {
	
	LinkedList <viaje> lista;
	 
	public ListaEscalas () {
		this.lista = new LinkedList <viaje>();
	}
	 
	public void registrarEscala (viaje viaje) {
		this.lista.add(viaje);
	}
	
	public LinkedList <viaje>  MostrarVieaje () {
		for(viaje c: lista);
		return lista;
	}
	
	public double CalcularDuracionTotalDeTodasLasEscalas () {	
		Integer total = 0;
		for (viaje c: lista) {
			total += c.getEscala();
		}	
		return total;	
	}
	
	public double CalcularDuracionPromedio (double total) {
		Integer cont = 0;
		for (viaje c: lista) {
			cont++;
		}
			return total/cont;
	}
	
	public Integer contarEscalasConDuracionEntre (Integer desde, Integer hasta) {
		Integer cont = 0;
		for(viaje c: lista) {
			if(c.getEscala()>= desde && c.getEscala() <= hasta)
				cont++;
		}
		
		return cont;
		
	}
	
	
}
