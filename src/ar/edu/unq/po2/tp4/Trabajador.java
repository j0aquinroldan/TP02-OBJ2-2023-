package ar.edu.unq.po2.tp4;

import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;

	public Trabajador(List<Ingreso> ingresos) {
		this.ingresos= ingresos;
	}

	public double getTotalPercibido() {
		return this.ingresos.stream().mapToDouble(i->i.getMontoPercibido()).sum();
	}

	public double getMontoImponible() {
		return this.ingresos.stream().mapToDouble(i->i.getMontoImponible()).sum();
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
	}
	

}
