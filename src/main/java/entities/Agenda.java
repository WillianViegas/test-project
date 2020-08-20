package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
	
	private Date dataRegistro;
	private String nivelUsuario;
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Agenda() {
	}
	
	public Agenda(Date dataRegistro, String nivelUsuario) {
		super();
		this.dataRegistro = dataRegistro;
		this.nivelUsuario = nivelUsuario;
	}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}



	public String getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(String nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void removeUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
}
