package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	private LocalDate fechaFinDesignacionPlantaTemporaria;
	private int cantidadHorasExtras;
	
	public EmpleadoPlantaTemporaria(String nombre, String direccion, int estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
	}

	@Override
	public double getSueldoBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDescuentoObraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAportesJubilatorios() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
