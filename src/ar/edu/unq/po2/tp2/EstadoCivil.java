package ar.edu.unq.po2.tp2;

public enum EstadoCivil {
	SOLTERO(0), CASADO(1), DIVORCIADO(0), VIUDO(0);
	
	private double rem;
	
	EstadoCivil(double i) {
		this.rem=i;
	}

	public double getRem() {
		return this.rem;
	}
}
