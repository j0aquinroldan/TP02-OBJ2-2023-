package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado  {

	private String nombre;
	private String direccion;
	private int estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;
	
	
	public Empleado(String nombre, String direccion, int estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public int getEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public abstract double getSueldoBruto() ;
	
	public  double getSueldoNeto() {
		return this.getSueldoBruto()-this.getRetenciones();
	}
	
	public  double getRetenciones() {
		return this.getDescuentoObraSocial() + this.getAportesJubilatorios();
	}
	
	public abstract double getDescuentoObraSocial();
	
	public abstract double getAportesJubilatorios();
}
