package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTestCase {
	
	ProductoPrimeraNecesidad ppn;
	ProductoPrimeraNecesidad ppn2;

	
	
	@BeforeEach
	void setup() {
		ppn = new ProductoPrimeraNecesidad("fideos", 40);
		ppn2 = new ProductoPrimeraNecesidad("carne", 100, true);

	}
	
	
	@Test
	void getPrecioFinalTest() {
		assertEquals(36, ppn.getPrecioFinal());
		}

}
