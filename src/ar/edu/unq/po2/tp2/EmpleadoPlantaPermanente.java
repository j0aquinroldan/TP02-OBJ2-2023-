package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {

	public EmpleadoPlantaPermanente(String nombre, String direccion, int estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		
	}
	private int cantidadHijos;
	private int añosAntiguedad;
	
	@Override
	public double getSueldoBruto() {
		return 0;
	}
	@Override
	public double getDescuentoObraSocial() {
		return 0;
	}
	@Override
	public double getAportesJubilatorios() {
		return 0;
	}
	
	public double getSalarioFamiliar() {
		return this.asignacionPorConyuge()+this.asignacionPorConyuge();
	}
	
	public double asignacionPorHijo() {
		return 150 * this.cantidadHijos;
	}
	
	public double asignacionPorConyuge() {
		return 150 * super.getEstadoCivil();
	}
	

	
}
