package ar.edu.unq.po2.tp3;

import java.util.function.BooleanSupplier;

public class Rectangulo {

	private Point inicio;
	private int height;
	private int length;
	
	public Rectangulo(Point inicio, int height, int length) {
		this.setInicio(inicio); 
		this.setHeight(height);;
		this.setLength(length);
	}
	
	public Point getInicio() {
		return inicio;
	}
	private void setInicio(Point inicio) {
		this.inicio = inicio;
	}
	public int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	private void setLength(int length) {
		this.length = length;
	}

	public int getArea() {
		return this.height*this.length;
	}

	public boolean esHorizontal() {
		return this.length>this.height;
	}

	public boolean esVertical() {
		return !esHorizontal();
	}
	
	
}
