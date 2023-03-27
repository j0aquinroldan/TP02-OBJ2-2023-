package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

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
		return this.numeros.stream().filter(multiplo->this.isMultipleOf(multiplo, n)).toArray().length;
	}

	private Boolean isMultipleOf(int multiplo, int numero) {
		return multiplo % numero == 0;
	}
}
