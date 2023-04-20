package ar.edu.unq.po2.tpsolid.BancoYPrestamos;

import java.util.List;
import java.util.stream.Collectors;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;

	public void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}

	public void agregarSolicitud(SolicitudCredito sc) {
		if (!this.clientes.contains(sc.getCliente())) {
			this.agregarCliente(sc.getCliente());
		}
		this.agregarSolicitud(sc);
	}
	
//	public Double getMontoTotal() {
//		return this.solicitudes.stream().mapToDouble(filter);
//	}
	
	public void otorgarMonto(Cliente cliente, SolicitudCredito sc) {
		
	}

}
