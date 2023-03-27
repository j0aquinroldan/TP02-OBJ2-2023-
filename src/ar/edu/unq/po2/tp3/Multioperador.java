package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Multioperador {
	
	public int sumar(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}
	
	public int restar(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).reduce(0, (subtotal, element) -> subtotal - element);
	}

	public Integer multiplicar(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).reduce(1, (subtotal, element) -> subtotal * element);
	}

}
