package Productos;

import java.util.ArrayList;

public class ListaDeProductos {
	
		private ArrayList<Productos> productos;
		
		public ListaDeProductos() {
			this.productos = new ArrayList<Productos>();
		}
		
		public void agregarProducto(Productos producto) {
			this.productos.add(producto);
		}
		
		public void imprimirLista() {
			for(Productos p : this.productos)
				System.out.println(p);
		}
		
		public void imprimirPosicion(Integer k) {
		System.out.println(this.productos.get(k-1));	
		}
		
		public ArrayList<Productos> obtenerListaStockMenorA50(Boolean menorA50){
			ArrayList<Productos> lista = new ArrayList<>();
			if(menorA50) {
				for(Productos p : this.productos) {
					if(p.getStock()<50) {
						lista.add(p);
					}
				}
				
			}
			return lista;
		}
		
		public ArrayList<Productos> obtenerListaStockMayorA50(Boolean menorA50){
			ArrayList<Productos> lista = new ArrayList<>();
			if(menorA50) {
				for(Productos p : this.productos) {
					if(p.getStock()<50) {
						lista.add(p);
					}
				}
				
			}
			return lista;
		}
}