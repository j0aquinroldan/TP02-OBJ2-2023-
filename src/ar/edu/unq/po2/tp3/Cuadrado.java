package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Point inicio, int height) {
		super(inicio, height, height);
	}

	public boolean esHorizontal() {
		return false;
	}

	public boolean esVertical() {
		return false;
	}
}
