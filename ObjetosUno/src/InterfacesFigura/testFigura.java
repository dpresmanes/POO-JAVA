package InterfacesFigura;

public class testFigura {
	public static void main(String[] args) {
		int cantidadElementos = 3;
		double areaTotal = 0;
		double a = 0;
		 
		
		Cuadrado[] Cuadrados = new Cuadrado[cantidadElementos];
		Circulo[] Circulos = new Circulo[cantidadElementos];
		
		Cuadrados [0] = new Cuadrado (2);
		Cuadrados [1] = new Cuadrado (3);
		Cuadrados [2] = new Cuadrado (4);
		
		Circulos [0] = new Circulo (2);
		Circulos [1] = new Circulo (3);
		Circulos [2] = new Circulo (4);
		
	
		for(int i = 0; i < cantidadElementos; i++ ) {
			areaTotal += Cuadrados[i].area() + Circulos[i].area();
			if(Circulos[i].circuloCompleto()) 
				a++;
			if(Cuadrados[i].cuadradoCompleto())
				a++;
			
			}
		
		System.out.println(areaTotal);
		System.out.println(a);
	}
	

}

