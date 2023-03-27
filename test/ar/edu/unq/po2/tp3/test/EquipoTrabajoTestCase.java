package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoTrabajo;
import ar.edu.unq.po2.tp3.Persona;

public class EquipoTrabajoTestCase {
	
	EquipoTrabajo e;
	Persona p;
	Persona p2;
	Persona p3;
	Persona p4;
	
	@BeforeEach
	void setup() {
		p = new Persona("joaquin", LocalDate.of(2001, 9, 5));
		p2 = new Persona("pepe", LocalDate.of(2005, 9, 5));
		p3 = new Persona("PIPO", LocalDate.of(1990, 10, 5));
		p4 = new Persona("PIPO", LocalDate.of(2000, 10, 5));
		
		e = new EquipoTrabajo("equipo",Arrays.asList(p,p2,p3,p4));
	}
	
	@Test
	void getNombreTest() {
		assertEquals("equipo", e.getNombre());
	}
	
	@Test
	void getPromedioEdadTest() {
		assertEquals(23, e.promedioEdad());
	}
}
