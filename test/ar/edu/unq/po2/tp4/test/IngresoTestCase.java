package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;

public class IngresoTestCase {
	
	Ingreso ingreso;
	
	@BeforeEach
	void setup() {
		ingreso = new Ingreso(Month.AUGUST, "mes agosto", 1000);
	}
	
	@Test
	void getMontoPercibidoTest() {
		assertEquals(1000, ingreso.getMontoPercibido());
	}
	
	@Test
	void getMontoImponibleTest() {
		assertEquals(1000, ingreso.getMontoImponible());
	}

}
