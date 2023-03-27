package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoTrabajo {
	private String nombre;
	private List<Persona> integrantes;
	
	public EquipoTrabajo(String nombre, List<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public String getNombre() {
		return nombre;
	}

	public double promedioEdad() {
		return this.integrantes.stream().mapToDouble(Persona::getEdad).average().orElse(Double.NaN);
	}
	
	
	
}
