package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTestCase {
	
	Multioperador m ;
	
	@BeforeEach
	void setup() {
		m = new Multioperador();
	}
	
	@Test
	public void sumarTest() {
		assertEquals(20, m.sumar(Arrays.asList(5,4,3,8)));
	}

	@Test
	public void restarTest() {
		assertEquals(-20, m.restar(Arrays.asList(5,4,3,8)));
	}
	
	@Test
	public void multiplicarTest() {
		assertEquals(480, m.multiplicar(Arrays.asList(5,4,3,8)));
	}
}
