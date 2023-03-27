package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Persona;

public class PersonaTestCase {
	
	Persona p;
	Persona p2;
	
	@BeforeEach
	void setup() {
		p = new Persona("joaquin", LocalDate.of(2001, 9, 5));
		p2 = new Persona("pepe", LocalDate.of(2005, 9, 5));
	}
	
	@Test
	void getNombreTest() {
		assertEquals("joaquin", p.getNombre());
	}
	
	@Test
	void getFecNacTest() {
		assertEquals(LocalDate.of(2001, 9, 5), p.getFecNac());
	}
	
	@Test
	void getEdadTest() {
		assertEquals(21, p.getEdad());
	}
	
	@Test
	void menorQueTest() {
		assertFalse(p.esMenorQue(p2));
		assertTrue(p2.esMenorQue(p));
	}
}
