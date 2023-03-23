package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	private LocalDate fechaFinDesignacionPlantaTemporaria;
	private int cantidadHorasExtras;
	
	public EmpleadoPlantaTemporaria(String nombre, String direccion, int estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, LocalDate fechaFinDesignacionPlantaTemporaria, int cantidadHorasExtras) {
		
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacionPlantaTemporaria = fechaFinDesignacionPlantaTemporaria;
		this.cantidadHorasExtras = cantidadHorasExtras;
	}


	@Override
	public double getSueldoBruto() {
		return super.getSueldoBasico() + this.getHorasExtras();
	}

	@Override
	public double getDescuentoObraSocial() {
		double descuentoEdad = 0;
		if (super.getEdad()>50) {
			descuentoEdad = 25;
		}
		return this.getSueldoBruto()*0.1 + descuentoEdad;
	}

	@Override
	public double getAportesJubilatorios() {
		return this.getSueldoBruto()*0.1 + this.cantidadHorasExtras *5;
	}
	
	public double getHorasExtras() {
		return this.cantidadHorasExtras * 40;
	}


	
}
