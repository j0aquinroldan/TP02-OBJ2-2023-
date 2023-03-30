package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	private int nroContrato;
	private String medioPago;

	public EmpleadoContratado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int nroContrato, String medioPago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		
		this.setNroContrato(nroContrato);
		this.setMedioPago(medioPago);
	}
	

	public int getNroContrato() {
		return nroContrato;
	}

	public void setNroContrato(int nroContrato) {
		this.nroContrato = nroContrato;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	@Override
	public double getSueldoBruto() {
		return super.getSueldoBasico();
	}

	@Override
	public double getDescuentoObraSocial() {
		return 0;
	}

	@Override
	public double getAportesJubilatorios() {
		return 0;
	}
	
	public double getRetenciones() {
		return 50;
	}
	
	


}
