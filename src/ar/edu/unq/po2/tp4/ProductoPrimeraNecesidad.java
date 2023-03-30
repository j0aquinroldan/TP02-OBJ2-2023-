package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precioBase) {
		super(nombre, precioBase);
		this.setDescuento(0.1);
	}

	public ProductoPrimeraNecesidad(String nombre, double precioBase, Boolean esPreciosCuidados) {
		super(nombre, precioBase, esPreciosCuidados);
		this.setDescuento(0.1);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precioBase, double descuento) {
		super(nombre, precioBase);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precioBase, Boolean esPreciosCuidados, double descuento) {
		super(nombre, precioBase, esPreciosCuidados);
		this.setDescuento(descuento);
	}

	private void setDescuento(double d) {
		this.descuento = d;
	}

	@Override
	public double getPrecioFinal() {
		return this.getPrecioBase() - (this.getPrecioBase() * this.descuento);

	}
}
