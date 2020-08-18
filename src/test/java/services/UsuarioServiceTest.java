package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	@Test
	public void deveRetornarDataNascimentoUsuario() {
		//cenario
		Usuario usuario1 = new Usuario("Usuario1", new Date(), 1.78f);
		//acao
		String resultado = uService.retornaDataNascimentoUsuario(usuario1);
		//verificacao
		error.checkThat(resultado, CoreMatchers.is("18/08/2020"));
	}
	
	@Test
	public void deveRetornarAlturaUsuario() {
		//cenario
		Usuario usuario1 = new Usuario("Usuario1", new Date(), 1.78f);
		
		//acao
		float resultado = uService.retornaAlturaUsuario(usuario1);
		
		//verificacao
		error.checkThat(resultado, CoreMatchers.is(1.78f));
	}
	
	@Test
	public void deveRetornarAIdadeDoUsuario() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//cenario
		Usuario usuario1 = new Usuario("Usuario1", sdf.parse("28/07/1998"), 1.78f);
		
		//acao
		int resultado = uService.retornaIdadeUsuario(usuario1);
		
		//verificacao
		error.checkThat(resultado, CoreMatchers.is(22));
	}
}
