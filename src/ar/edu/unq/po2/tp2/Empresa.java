package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private String cuit;
	private List<Empleado> empleados;

	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		this.setNombre(nombre);
		this.setCuit(cuit);
		this.setEmpleados(empleados);
	}

	public Empresa(String nombre, String cuit) {
		this.setNombre(nombre);
		this.setCuit(cuit);
		this.setEmpleados(new ArrayList<Empleado>());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void contratar(Empleado e) {
		this.getEmpleados().add(e);
	}

	public void despedir(Empleado e) {
		this.getEmpleados().remove(e);
	}

	public double getMontoTotalSueldosNetos() {
		return this.getEmpleados().stream().mapToDouble(e -> e.getSueldoNeto()).sum();
	}

	public double getMontoTotalSueldosBrutos() {
		return this.getEmpleados().stream().mapToDouble(e -> e.getSueldoBruto()).sum();
	}

	public double getMontoTotalRetenciones() {
		return this.getEmpleados().stream().mapToDouble(e -> e.getRetenciones()).sum();
	}

}
