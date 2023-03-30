package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoPlantaPermanente;
import ar.edu.unq.po2.tp2.EstadoCivil;

public class EmpleadoPlantaPermanenteTest {

	EmpleadoPlantaPermanente empPermanente;

	@BeforeEach
	public void setup() {
		LocalDate fecnac = LocalDate.of(2001, 9, 5);
		empPermanente = new EmpleadoPlantaPermanente("joaquin", "alem", EstadoCivil.CASADO, fecnac, 20000, 1, 10);
	}

	@Test
	public void getEdadtest() {
		assertEquals(21, empPermanente.getEdad());
	}

	@Test
	public void getSueldoBasicotest() {
		assertEquals(20000, empPermanente.getSueldoBasico());
	}

	@Test
	public void getAntiguedadtest() {
		assertEquals(500, empPermanente.getAntiguedad());
	}

	@Test
	public void asignacionPorHijoTest() {
		assertEquals(150, empPermanente.asignacionPorHijo());
	}

	@Test
	public void asignacionPorConyugeTest() {
		assertEquals(100, empPermanente.asignacionPorConyuge());
	}

	@Test
	public void getSalarioFamiliarTest() {
		assertEquals(250, empPermanente.getSalarioFamiliar());
	}

	@Test
	public void getSueldoBrutoTest() {
		assertEquals(20750, empPermanente.getSueldoBruto());
	}

	@Test
	public void getDescuentoObraSocialTest() {
		assertEquals(2095, empPermanente.getDescuentoObraSocial());
	}

	@Test
	public void getAportesJubilatoriosTest() {
		assertEquals(3112.5, empPermanente.getAportesJubilatorios());
	}

	@Test
	public void getRetencionesTest() {
		assertEquals(5207.5, empPermanente.getRetenciones());
	}

	@Test
	public void getSueldoNetoTest() {
		assertEquals(15542.5, empPermanente.getSueldoNeto());
	}
	

}
