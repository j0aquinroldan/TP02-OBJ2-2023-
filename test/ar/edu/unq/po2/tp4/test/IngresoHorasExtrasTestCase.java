package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoHorasExtras;

public class IngresoHorasExtrasTestCase {
	
	IngresoHorasExtras ingresoHorasExtras;
	
	@BeforeEach
	void setup() {
		ingresoHorasExtras = new IngresoHorasExtras(Month.AUGUST, "mes agosto", 1000, 5);
	}
	
	@Test
	void getMontoPercibidoTest() {
		assertEquals(1000, ingresoHorasExtras.getMontoPercibido());
	}
	
	@Test
	void getMontoImponibleTest() {
		assertEquals(0, ingresoHorasExtras.getMontoImponible());
	}

}