package CasaInteligente;
import java.util.LinkedList;


public class SistemaCentral {
	
 LinkedList <DispositivosInteligentes> casa;
 
public SistemaCentral () {
	this.casa = new LinkedList<DispositivosInteligentes>();
}


public void AgregarDispositivosAlaLista(DispositivosInteligentes c) {
	this.casa.add(c);
}

public void mostrarLista () {
	for (DispositivosInteligentes c: casa) {
		System.out.println(c);
	}
	
}



public void encenderTodo () {
	for (DispositivosInteligentes p: casa) {
			if(p.getEstado()==false) {
		p.setEstado(true);
		     System.out.println(p);	
			}
	}
	}






}
