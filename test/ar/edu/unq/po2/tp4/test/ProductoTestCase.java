package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;

public class ProductoTestCase {
	Producto p;
	Producto p2;

	@BeforeEach
	void setup() {
		p = new Producto("limpiador", 50);
		p2 = new Producto("galletitas", 40, true);
	}
	
	@Test
	void getPrecioBaseTest() {
		assertEquals(50, p.getPrecioBase());
	}
	@Test
	void getPrecioFinalTest() {
		assertEquals(50, p.getPrecioFinal());
	}
	
	/***
	 * este metodo testea el caso en que no se especifique si es precios cuidados o no
	 */
	@Test
	void esPrecioCuidadoTest() {
		assertFalse(p.esPrecioCuidado());
	}
	
	/***
	 * este metodo testea el caso en que SI se especifique si que es precios cuidados 
	 */
	@Test
	void esPrecioCuidadoTest2() {
		assertTrue(p2.esPrecioCuidado());
	}
	
}
