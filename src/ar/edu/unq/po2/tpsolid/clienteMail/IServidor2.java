package ar.edu.unq.po2.tpsolid.clienteMail;

import java.util.List;

// principio de segregacion de interfaces

public interface IServidor2 {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);

}
