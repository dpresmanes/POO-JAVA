package Productos;

public class Productos {
	private Integer codigo;
	private String descripcion;
	private Double importe;
	private Integer Stock;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Integer getStock() {
		return Stock;
	}
	public void setStock(Integer stock) {
		Stock = stock;
	}
	
	public Productos (Integer codigo, String descripcion, Double importe, Integer stock) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setImporte(importe);
		this.setStock(stock);
		
		
	}

}

