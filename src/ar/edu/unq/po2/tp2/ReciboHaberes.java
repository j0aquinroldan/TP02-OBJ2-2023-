package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboHaberes {

	private String nombre;
	private String dirección;
	private LocalDate fechaEmisión;
	private double sueldoBruto;
	private double SueldoNeto;

	public ReciboHaberes(String nombre, String dirección, LocalDate fechaEmisión, double sueldoBruto,
			double sueldoNeto) {
		this.setNombre(nombre);
		this.setDirección(dirección);
		this.setFechaEmisión(fechaEmisión);
		this.setSueldoBruto(sueldoBruto);
		this.setSueldoNeto(sueldoNeto);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public void setFechaEmisión(LocalDate fechaEmisión) {
		this.fechaEmisión = fechaEmisión;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		SueldoNeto = sueldoNeto;
	}
	
	public LocalDate getFechaEmisión() {
		return fechaEmisión;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDirección() {
		return dirección;
	}
 
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public double getSueldoNeto() {
		return SueldoNeto;
	}

}
