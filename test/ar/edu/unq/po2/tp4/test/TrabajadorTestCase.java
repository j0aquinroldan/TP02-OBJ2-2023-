package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoHorasExtras;
import ar.edu.unq.po2.tp4.Trabajador;

public class TrabajadorTestCase {
	
	Trabajador t;
	IngresoHorasExtras ingresoHorasExtras;
	Ingreso ingreso;
	Ingreso ingreso2;
	
	@BeforeEach
	void setup() {
		ingreso2 = new Ingreso(Month.AUGUST, "mes agosto", 1000);
		ingreso = new Ingreso(Month.APRIL, "mes abril", 500);
		ingresoHorasExtras = new IngresoHorasExtras(Month.AUGUST, "mes agosto", 1000, 5);
		t = new Trabajador(Arrays.asList(ingreso, ingreso2,ingresoHorasExtras));
	}
	
	@Test
	void getTotalPercibidoTest() {
		assertEquals(2500, t.getTotalPercibido());
	}
	
	@Test
	void getMontoImponibleTest() {
		assertEquals(1500, t.getMontoImponible());
	}

	@Test
	void getImpuestoAPagarTest() {
		assertEquals(30, t.getImpuestoAPagar());
	}
}
