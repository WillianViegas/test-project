package services;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import entities.Usuario;

public class UsuarioServiceTest {

	private UsuarioService uService;
	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Before
	public void setUp(){
		uService = new UsuarioService();
	}
	
	@Test
	public void deveRetornarNomeUsuario() {
		//cenario
		Usuario usuario1 = new Usuario("Usuario1", new Date(), 1.78f);
		
		//acao
		String resultado = uService.retornaNomeUsuario(usuario1);
		
		//verificacao
		error.checkThat(resultado, CoreMatchers.is("Usuario1"));
		error.checkThat(resultado, CoreMatchers.notNullValue());
	}

}
