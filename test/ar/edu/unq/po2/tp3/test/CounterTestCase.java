package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
	private Counter counter;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 1);
	}

	/**
	 * Verifica la cantidad de impares
	 */
	@Test
	public void testOddNumbers() {
// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 9);
	}

	/**
	 * Verifica la cantidad de multiplos de 3
	 */
	@Test
	public void testMultipleOf3Numbers() {
// Getting the odd occurrences
		int amount = counter.getMultiplesOf(3);
// I check the amount is the expected one
		assertEquals(amount, 2);
	}

	@Test
	public void testMostEvenDigits() {

		int numero = counter.mostEvenDigits(Arrays.asList(120, 33, 246, 550));
		assertEquals(numero, 246);
	}

	@Test
	public void testMaxMultiple() {

		assertEquals(counter.maxMultiple(3, 9), 999);
	}

	@Test
	public void testMaxMultiple2() {

		assertEquals(counter.maxMultiple(90, 30), 990);
	}

	@Test
	public void testMaxMultiple3() {

		assertEquals(counter.maxMultiple(40, 20), 1000);
	}

	@Test
	public void testMaxMultiple4() {

		assertEquals(counter.maxMultiple(900, 1000), -1);
	}

}