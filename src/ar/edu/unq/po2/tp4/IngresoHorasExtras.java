package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoHorasExtras extends Ingreso{
	
	private int horasExtras;

	public IngresoHorasExtras(Month mesPercepcion, String concepto, double monto, int horasExtras) {
		super(mesPercepcion, concepto, monto);
		this.horasExtras= horasExtras;
	}
	
	public double getMontoImponible() {
		return 0;
	}

}
