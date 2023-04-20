package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

import java.util.List;

public abstract class SolicitudCredito {

	private Cliente cliente;
	private Double monto;
	private int plazo;

	// CONSTRUCTOR
	public SolicitudCredito(Cliente cliente, Double monto, int plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}

	// GETTS Y SETS
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	///
	
	public Double getMontoCuota() {
		return monto / plazo;
	}

	public abstract boolean esAceptable();

}
