package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BooleanSupplier;

public class Persona {
	
	private String nombre;
	private LocalDate fecNac;
	
	public Persona(String nombre, LocalDate fecNac) {
		this.nombre = nombre;
		this.fecNac = fecNac;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFecNac() {
		return fecNac;
	}
	
	public int getEdad() {
		return Period.between(fecNac, LocalDate.now()).getYears();
	}
	public boolean esMenorQue(Persona p2) {
		return this.getEdad()<p2.getEdad();
	}

}
