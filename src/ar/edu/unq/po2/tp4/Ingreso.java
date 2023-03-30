package ar.edu.unq.po2.tp4;

import java.time.Month;

public class Ingreso {
	
	private Month mesPercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(Month mesPercepcion, String concepto, double monto) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = monto;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}
}
