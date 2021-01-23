package Tragamonedas;

public class Tambor {	
	
   
  private Tambor tambor[]; 
  
  Tambor[] tambor1 = new Tambor[8];
  Tambor[] tambor2 = new Tambor[8];
  Tambor[] tambor3 = new Tambor[8];

public int obtenerPosicion (Tambor tambor[]) {
	int pos = 1;
	Tambor posicion = tambor[pos];
	   for (int i = 0; i<tambor.length; i++) {
		   if(tambor[i] == posicion) {
			    posicion = tambor[i];
		   }
	   }
	
	return pos;
  }
  
  public void girar () {
	int pos = (int)(Math.random()*tambor.length);
	 if  (tambor[pos] != null) {
		System.out.println(pos);
	 }
	
	
  }
  
	
	
}
