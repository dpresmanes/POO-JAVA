package Viaje;

import java.util.LinkedList;

public class PruebaViajes {
	public static void main(String[] args) {
		double total = 0;
		ListaEscalas lista = new ListaEscalas();
		
		viaje escala1 = new viaje(1);
		viaje escala2 = new viaje(2);
		viaje escala3 = new viaje(4);
		viaje escala4 = new viaje(5);
		viaje escala5 = new viaje(7);
		viaje escala6 = new viaje(8);
		viaje escala7 = new viaje(9);
		
		lista.registrarEscala(escala1);
		lista.registrarEscala(escala2);
		lista.registrarEscala(escala3);
		lista.registrarEscala(escala4);
		lista.registrarEscala(escala5);
		lista.registrarEscala(escala6);
		lista.registrarEscala(escala7);
		
		lista.MostrarVieaje();
		System.out.println(lista.CalcularDuracionTotalDeTodasLasEscalas());
		total = lista.CalcularDuracionTotalDeTodasLasEscalas();
		System.out.println(lista.CalcularDuracionPromedio(total));
		System.out.println(lista.contarEscalasConDuracionEntre(4, 7));
		
		
		
		
		
		
	}

}
