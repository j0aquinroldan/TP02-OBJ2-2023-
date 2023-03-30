package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoContratado;
import ar.edu.unq.po2.tp2.EmpleadoPlantaPermanente;
import ar.edu.unq.po2.tp2.EmpleadoPlantaTemporaria;
import ar.edu.unq.po2.tp2.Empresa;
import ar.edu.unq.po2.tp2.EstadoCivil;
import ar.edu.unq.po2.tp2.ReciboHaberes;

public class EmpresaTest {

	EmpleadoPlantaPermanente joaquin;
	EmpleadoPlantaTemporaria pepe;
	EmpleadoContratado empContratado;
	Empresa empresa;

	@BeforeEach
	public void setup() {
		LocalDate fecnac = LocalDate.of(2001, 9, 5);
		LocalDate fecini = LocalDate.of(2023, 5, 5);
		pepe = new EmpleadoPlantaTemporaria("pepe", "calle falsa 123", EstadoCivil.DIVORCIADO, fecnac, 15000, fecini, 5);
		joaquin = new EmpleadoPlantaPermanente("joaquin", "alem", EstadoCivil.CASADO, fecnac, 20000, 1, 10);
		empContratado = new EmpleadoContratado("joaquin", "alem", EstadoCivil.CASADO, fecnac, 20000, 1, "cheque");

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
		empresa.contratar(empContratado);
		assertEquals(3065 + 5207.5 + 50, empresa.getMontoTotalRetenciones());
	}

	@Test
	public void getMontoTotalSueldosBrutosTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		empresa.contratar(empContratado);
		assertEquals(20750 + 15200 + 20000, empresa.getMontoTotalSueldosBrutos());
	}

	@Test
	public void getMontoTotalSueldosNetosTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		empresa.contratar(empContratado);
		assertEquals(12135 + 15542.5 + 19950, empresa.getMontoTotalSueldosNetos());
	}

	@Test
	public void generarReciboTest() {

		assertTrue(pepe.getRecibos().isEmpty());

		empresa.generarRecibo(pepe);
		assertFalse(pepe.getRecibos().isEmpty());
	}

	@Test
	public void generarReciboValoresTest() {

		empresa.generarRecibo(pepe);

		ReciboHaberes r = pepe.getUltimoRecibo().get();

		assertEquals(r.getNombre(), "pepe");
		assertEquals(r.getDirección(), pepe.getDireccion());
		assertEquals(r.getFechaEmisión(), LocalDate.now());
		assertEquals(r.getSueldoBruto(), pepe.getSueldoBruto());
		assertEquals(r.getSueldoNeto(), pepe.getSueldoNeto());
	}

	@Test
	public void liquidarSueldosTest() {
		empresa.contratar(pepe);
		empresa.contratar(joaquin);
		empresa.contratar(empContratado);

		assertTrue(pepe.getRecibos().isEmpty());
		assertTrue(joaquin.getRecibos().isEmpty());
		assertTrue(empContratado.getRecibos().isEmpty());

		empresa.liquidarSueldos();
		assertFalse(joaquin.getRecibos().isEmpty());
		assertFalse(pepe.getRecibos().isEmpty());
		assertFalse(empContratado.getRecibos().isEmpty());
	}

}
