package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean esAceptable() {
		boolean anualMasQue15K = this.getCliente().getSueldoNetoAnual() >= 15000;
		boolean cuotaMenorAl70Mensual = this.getMonto()<= this.getCliente().getSueldoNetoMensual()*0.7;
		return anualMasQue15K && cuotaMenorAl70Mensual;
	}

}
