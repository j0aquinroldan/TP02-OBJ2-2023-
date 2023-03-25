package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public abstract class Empleado {

	private String nombre;
	private String direccion;

	private int estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;
	private List<ReciboHaberes> recibos;

	public Empleado(String nombre, String direccion, int estadoCivil, LocalDate fechaNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.setRecibos(new ArrayList<>());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public int getEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}

	public List<ReciboHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<ReciboHaberes> recibos) {
		this.recibos = recibos;
	}

	public abstract double getSueldoBruto();

	public double getSueldoNeto() {
		return this.getSueldoBruto() - this.getRetenciones();
	}

	public double getRetenciones() {
		return this.getDescuentoObraSocial() + this.getAportesJubilatorios();
	}

	public abstract double getDescuentoObraSocial();

	public abstract double getAportesJubilatorios();

	public void guardarRecibo(ReciboHaberes recibo) {
		this.getRecibos().add(recibo);
	}

	public Optional<ReciboHaberes> getUltimoRecibo() {
		return this.getRecibos().stream()
				.min(Comparator.comparingInt(r -> Period.between(r.getFechaEmisión(), LocalDate.now()).getDays()));
	}
}
