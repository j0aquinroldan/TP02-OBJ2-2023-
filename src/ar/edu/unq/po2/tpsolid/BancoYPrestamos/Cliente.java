package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private Double sueldoNetoMensual;

	public Cliente(String nombre, String apellido, int edad, Double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public int getEdad() {
		return edad;
	}

	public Double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void solicitarCredito(SolicitudCredito sc, Banco banco) {
		banco.agregarSolicitud(sc);
	}

}
