package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class RectanguloTestCase {
	
	Rectangulo r;
	Point p;
	
	@BeforeEach
	public void setup() {
		p= new Point();
		r = new Rectangulo(p, 10, 25);
		
	}
	
	@Test
	public void getAreaTest() {
		assertEquals(250, r.getArea());
	}
	
	@Test
	public void esHorizontalTest() {
		assertTrue(r.esHorizontal());
		
	}
	
	@Test
	public void esVerticalTest() {
		assertFalse(r.esVertical());
		
	}

}
