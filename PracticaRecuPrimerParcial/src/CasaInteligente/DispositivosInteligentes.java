package CasaInteligente;

public abstract class DispositivosInteligentes {

private String marca;
private String ubicacion;
private String tipo;
private Boolean estado2;
private Boolean principal;

public Boolean getPrincipal() {
	return principal;
}
public void setPrincipal(Boolean principal) {
	this.principal = principal;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}
public Boolean getEstado() {
	return estado2;
}
public void setEstado(boolean estado2) {
	this.estado2 = estado2;
}

public DispositivosInteligentes (String marca, String ubicacion,String tipo, boolean estado2) {
	this.setMarca(marca);
	this.setUbicacion(ubicacion);
	this.setTipo(tipo);
	this.setEstado(estado2);
	
}

public DispositivosInteligentes (String marca, String ubicacion,String tipo, boolean estado2, boolean principal) {
	this.setMarca(marca);
	this.setUbicacion(ubicacion);
	this.setTipo(tipo);
	this.setEstado(estado2);
	this.setPrincipal(principal);
	
}


@Override
 
public String toString() { 
	
	String representacion = "Marca: ";  
	representacion += (this.getMarca()!=null)? this.getMarca().toString() : "Sin Marca ";
	return  "Tipo: " + this.getTipo() + "\n " + representacion + "\n "+ "Ubicacion: " + this.getUbicacion();
}



	
	
	
	
	
}
