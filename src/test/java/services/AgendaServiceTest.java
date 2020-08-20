package services;

import static org.hamcrest.CoreMatchers.is;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import entities.Agenda;
import entities.Usuario;

public class AgendaServiceTest {

	@Test
	public void deveArmazenarUsuarioNaAgenda() {
		//cenario
		AgendaService aS = new AgendaService();
		Usuario usuario = new Usuario("Usuario1", new Date(), 1.87f);
		
		//acao
		Agenda resultado = aS.armazenaUsuarioNaAgenda(usuario);
		
		//verificacao
		Assert.assertThat(resultado.getNivelUsuario(), is("comum"));
	}
}
