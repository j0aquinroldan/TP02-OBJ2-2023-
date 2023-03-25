package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.Empleado;
import ar.edu.unq.po2.tp2.EmpleadoContratado;

public class EmpleadoContratadoTest {
	EmpleadoContratado empContratado;
	Empleado prueba;

	@BeforeEach
	public void setup() {
		LocalDate fecnac = LocalDate.of(2001, 9, 5);
		empContratado = new EmpleadoContratado("joaquin", "alem", 1, fecnac, 20000, 1, "cheque");
		prueba = new EmpleadoContratado("joaquin", "alem", 1, fecnac, 20000, 1, "cheque");
	}
	
	@Test
	public void getSueldoBrutoTest() {
		assertEquals(20000, empContratado.getSueldoBruto());
	}
	
	@Test
	public void getDescuentoObraSocialTest() {
		assertEquals(0, empContratado.getDescuentoObraSocial());
	}
	
	@Test
	public void getAportesJubilatoriosTest() {
		assertEquals(0, empContratado.getAportesJubilatorios());
	}
	
	@Test
	public void getRetencionesTest() {
		assertEquals(50, empContratado.getRetenciones());
	}
	
	@Test
	public void getSueldoNetoTest() {
		assertEquals(19950, empContratado.getSueldoNeto());
	}
}
