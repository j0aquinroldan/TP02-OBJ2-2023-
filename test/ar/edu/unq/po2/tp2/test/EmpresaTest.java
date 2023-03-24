package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoPlantaPermanente;
import ar.edu.unq.po2.tp2.EmpleadoPlantaTemporaria;
import ar.edu.unq.po2.tp2.Empresa;

public class EmpresaTest {

	EmpleadoPlantaPermanente joaquin;
	EmpleadoPlantaTemporaria pepe;
	Empresa empresa;

	@BeforeEach
	public void setup() {
		LocalDate fecnac = LocalDate.of(2001, 9, 5);
		LocalDate fecini = LocalDate.of(2023, 5, 5);
		pepe = new EmpleadoPlantaTemporaria("pepe", "calle falsa 123", 0, fecnac, 15000, fecini, 5);
		joaquin = new EmpleadoPlantaPermanente("joaquin", "alem", 1, fecnac, 20000, 1, 10);

		empresa = new Empresa("empresa", "123");
	}

	@Test
	public void contratarTest() {
		empresa.contratar(pepe);
		assertEquals(Arrays.asList(pepe), empresa.getEmpleados());
	}

	@Test
	public void despedirTest() {
		empresa.contratar(pepe);
		empresa.despedir(pepe);
		assertEquals(Arrays.asList(), empresa.getEmpleados());
	}

	@Test
	public void getMontoTotalRetencionesTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		assertEquals(3065 + 5207.5, empresa.getMontoTotalRetenciones());
	}

	@Test
	public void getMontoTotalSueldosBrutosTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		assertEquals(20750 + 15200, empresa.getMontoTotalSueldosBrutos());
	}

	@Test
	public void getMontoTotalSueldosNetosTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		assertEquals(12135 + 15542.5, empresa.getMontoTotalSueldosNetos());
	}
}
