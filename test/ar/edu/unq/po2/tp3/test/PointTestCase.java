package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

public class PointTestCase {
	
	Point p;
	Point p2;
	
	@BeforeEach
	public void setup() {
		p = new Point(5,7);
		p2 = new Point();
	}

	@Test
	public void testIni() {
		assertEquals(5, p.getX());
		assertEquals(7, p.getY());
		assertEquals(0, p2.getX());
		assertEquals(0, p2.getY());
	}
	
	@Test
	public void testMoveTo() {
		
		assertEquals(0, p2.getX());
		assertEquals(0, p2.getY());
		
		p2.move(3,2);
		
		assertEquals(3, p2.getX());
		assertEquals(2, p2.getY());
	}
	
	@Test
	public void test2MoveTo() {
		
		assertEquals(5, p.getX());
		assertEquals(7, p.getY());
		
		p.move(3,2);
		
		assertEquals(8, p.getX());
		assertEquals(9, p.getY());
	}
	
	@Test
	public void testPlus() {
		
		assertEquals(5, p.getX());
		assertEquals(7, p.getY());
		
		p2.move(6, 9);
		
		Point p3 = p.plus(p2);
		
		assertEquals(11, p3.getX());
		assertEquals(16, p3.getY());
	}
}
