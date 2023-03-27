package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class CuadradoTestCase {

	Cuadrado c;
	Point p;

	@BeforeEach
	public void setup() {
		p = new Point();
		c = new Cuadrado(p, 10);
	}

	@Test
	public void getAreaTest() {
		assertEquals(100, c.getArea());
	}

	@Test
	public void esHorizontalTest() {
		assertFalse(c.esHorizontal());
	}

	@Test
	public void esVerticalTest() {
		assertFalse(c.esVertical());
	}

}