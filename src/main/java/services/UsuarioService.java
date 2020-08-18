package services;

import entities.Usuario;

public class UsuarioService {


	public String retornaNomeUsuario(Usuario usuario) {
		return usuario.getNome();
	}
}
