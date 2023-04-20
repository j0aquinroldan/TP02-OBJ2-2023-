package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	
	private Propiedad propiedad;

	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {
		boolean cuotaMenorAl50Mensual = this.getMonto()<= this.getCliente().getSueldoNetoMensual()*0.5;
		boolean montoMenorA70Prop = this.getMonto()<= this.propiedad.getValorFiscal()*0.7;
		boolean menorA65 = this.getCliente().getEdad() + this.getPlazo()/12 <= 65;
		return cuotaMenorAl50Mensual && montoMenorA70Prop && menorA65;
	}

}
