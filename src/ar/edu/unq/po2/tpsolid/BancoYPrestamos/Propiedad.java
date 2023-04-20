package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

public class Propiedad {
	
	private String descripcion;
	private String direcion;
	private Double valorFiscal;
	
	public Propiedad(String descripcion, String direcion, Double valorFiscal) {
		this.descripcion = descripcion;
		this.direcion = direcion;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDirecion() {
		return direcion;
	}

	public Double getValorFiscal() {
		return valorFiscal;
	}
	
	
	
	

}
