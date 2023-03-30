package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private double precioBase;
	private Boolean esPreciosCuidados;
	
	public Producto(String nombre, double precioBase) {
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
		this.setEsPreciosCuidados(false);
	}
	
	public Producto(String nombre, double precioBase, Boolean esPreciosCuidados) {
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
		this.setEsPreciosCuidados(esPreciosCuidados);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public void setEsPreciosCuidados(Boolean esPreciosCuidados) {
		this.esPreciosCuidados = esPreciosCuidados;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPrecioFinal() {
		return this.getPrecioBase();
	}

	public Boolean esPrecioCuidado() {
		return this.esPreciosCuidados;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void aumentarPrecio(double d) {
		this.setPrecioBase(precioBase+d);
		
	}
}
