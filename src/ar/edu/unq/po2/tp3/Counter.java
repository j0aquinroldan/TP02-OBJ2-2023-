package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Counter {
	private ArrayList<Integer> numeros;

	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}

	public int getEvenOcurrences() {
		return this.getMultiplesOf(2);
	}

	public int getOddOcurrences() {
		return Math.abs(this.numeros.size() - this.getMultiplesOf(2));
	}

	public void addNumber(int i) {
		this.numeros.add(i);
	}

	public int getMultiplesOf(int n) {
		return this.numeros.stream().filter(multiplo -> this.isMultipleOf(multiplo, n)).toArray().length;
	}

	private Boolean isMultipleOf(int multiplo, int numero) {
		return multiplo % numero == 0;
	}

	public int mostEvenDigits(List<Integer> lista) {
		return lista.stream().max(Comparator.comparing(n -> this.evenDigits(n))).get();

	}

	private int evenDigits(Integer n) {
		int numero = n;
		int digito;
		this.clearNumbers();

		while (numero != 0) {
			digito = numero % 10;
			this.addNumber(digito);
			numero = numero / 10;
		}

		return this.getEvenOcurrences();
	}

	public void clearNumbers() {
		this.numeros.clear();
	}

	public int maxMultiple(int x, int y) {
		int multiplo = x * y;
		int result = 1000;

		while (!(this.isMultipleOf(result, x) && this.isMultipleOf(result, y))) {
			result--;
		}
		if (result == 0 || multiplo < 0) {
			result = -1;
		}
		return result;
	}
}
