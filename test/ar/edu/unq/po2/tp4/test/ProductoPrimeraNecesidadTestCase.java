package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTestCase {

	ProductoPrimeraNecesidad leche;
	ProductoPrimeraNecesidad ppn3;
	ProductoPrimeraNecesidad ppn2;		



	@BeforeEach
	void setup() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		ppn2 = new ProductoPrimeraNecesidad("arroz", 40, 0.08);
		ppn3 = new ProductoPrimeraNecesidad("leche", 100, true, 0.11);
	}

	@Test
	void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecioFinal());
	}
	
	@Test
	void testCalcularPrecio2() {
		assertEquals(36.8, ppn2.getPrecioFinal());
	}
	
	@Test
	void testCalcularPrecio3() {
		assertEquals(89, ppn3.getPrecioFinal());
	}

}
