package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {

	
	public EmpleadoPlantaPermanente(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int cantidadHijos, int añosAntiguedad) {
		
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.añosAntiguedad = añosAntiguedad;
		
	}
	private int cantidadHijos;
	private int añosAntiguedad;
	
	@Override
	public double getSueldoBruto() {
		return super.getSueldoBasico()+this.getSalarioFamiliar()+ this.getAntiguedad();
	}
	@Override
	public double getDescuentoObraSocial() {
		return this.getSueldoBruto() * 0.1 + 20 * this.cantidadHijos;
	}
	@Override
	public double getAportesJubilatorios() {
		return this.getSueldoBruto() *0.15;
	}
	
	public double getSalarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuge() ;
	}
	
	public double asignacionPorHijo() {
		return 150 * this.cantidadHijos;
	}
	
	public double asignacionPorConyuge() {
		return 100 * super.getEstadoCivil().getRem();
	}
	
	public double getAntiguedad() {
		return this.añosAntiguedad*50;
	}
	

	
}
