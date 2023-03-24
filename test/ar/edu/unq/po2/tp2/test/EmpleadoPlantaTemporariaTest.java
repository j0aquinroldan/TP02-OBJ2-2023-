package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoPlantaTemporaria;

public class EmpleadoPlantaTemporariaTest {

	EmpleadoPlantaTemporaria empTemporaria;
	EmpleadoPlantaTemporaria empTemporaria2;

	@BeforeEach
	public void setup() {
		LocalDate fecnac = LocalDate.of(2000, 9, 5);
		LocalDate fecnac2 = LocalDate.of(1970, 9, 5);
		LocalDate fecini = LocalDate.of(2023, 5, 5);
		empTemporaria = new EmpleadoPlantaTemporaria("pepe", "calle falsa 123", 0, fecnac, 15000, fecini, 5);
		empTemporaria2 = new EmpleadoPlantaTemporaria("carlos", "calle falsa 123", 1, fecnac2, 15000, fecini, 5);
	}

	@Test
	public void getEdadtest() {
		assertEquals(22, empTemporaria.getEdad());
	}

	@Test
	public void getSueldoBasicotest() {
		assertEquals(15000, empTemporaria.getSueldoBasico());
	}

	@Test
	public void getHorasExtrasTest() {
		assertEquals(200, empTemporaria.getHorasExtras());
	}

	@Test
	public void getSueldoBrutoTest() {
		assertEquals(15200, empTemporaria.getSueldoBruto());
	}

	@Test
	public void getDescuentoObraSocialTest() {
		assertEquals(1520, empTemporaria.getDescuentoObraSocial());
	}

	@Test
	public void getDescuentoObraSocialTest2() {
		assertEquals(1545, empTemporaria2.getDescuentoObraSocial());
	}

	@Test
	public void getAportesJubilatoriosTest() {
		assertEquals(1545, empTemporaria.getAportesJubilatorios());
	}

	@Test
	public void getRetencionesTest() {
		assertEquals(3065, empTemporaria.getRetenciones());
	}

	@Test
	public void getSueldoNetoTest() {
		assertEquals(12135, empTemporaria.getSueldoNeto());
	}
}
