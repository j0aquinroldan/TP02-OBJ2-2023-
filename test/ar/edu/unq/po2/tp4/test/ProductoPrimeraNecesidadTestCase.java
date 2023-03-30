package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTestCase {

	ProductoPrimeraNecesidad ppn;
	ProductoPrimeraNecesidad leche;

	@BeforeEach
	void setup() {
		ppn = new ProductoPrimeraNecesidad("fideos", 40);
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}

	@Test
	void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecioFinal());
	}

}
