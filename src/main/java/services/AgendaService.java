package services;

import java.util.Date;

import entities.Agenda;
import entities.Usuario;

public class AgendaService {

	public Agenda armazenaUsuarioNaAgenda(Usuario usuario) {
		Agenda agenda = new Agenda(new Date(), "comum");
		agenda.addUsuario(usuario);
		return agenda;
	}

}
