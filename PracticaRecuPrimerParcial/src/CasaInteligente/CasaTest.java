package CasaInteligente;

import java.util.LinkedList;

public class CasaTest {
public static void main(String[] args) {
	
	Televisores tvA = new Televisores ("LG", "Comedor", "TV", false);
	Televisores tvB = new Televisores ("LG", "Habitacion", "TV", false);
	
	Portones portA = new Portones ("Entrada","Porton",false);
	Portones portB = new Portones ("Salida","Porton",false);
	
	LucesExteriores luzA= new LucesExteriores ("Entrada","Luz Exterior", false, true );
	LucesExteriores luzB= new LucesExteriores ("Patio","Luz Exterior", false, false );
	
	LucesInteriores luzC= new LucesInteriores ("Cocina", "Luz Interior", false);
	
	SistemaCentral casa = new SistemaCentral();
	
	casa.AgregarDispositivosAlaLista(tvA);
	casa.AgregarDispositivosAlaLista(tvB);
	casa.AgregarDispositivosAlaLista(portA);
	casa.AgregarDispositivosAlaLista(portB);
	casa.AgregarDispositivosAlaLista(luzA);
	casa.AgregarDispositivosAlaLista(luzB);
	casa.AgregarDispositivosAlaLista(luzC);
	
    //casa.mostrarLista();
    //casa.encenderTodo();
    casa.mostrarLista();
    
    
    
	
	
		
	
}



}
