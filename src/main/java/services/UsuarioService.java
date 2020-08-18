package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import entities.Usuario;

public class UsuarioService {


	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String retornaNomeUsuario(Usuario usuario) {
		return usuario.getNome();
	}

	public String retornaDataNascimentoUsuario(Usuario usuario) {
		return sdf.format(usuario.getDataNasc());
	}

	public Float retornaAlturaUsuario(Usuario usuario) {
		return usuario.getAltura();
	}

	public int retornaIdadeUsuario(Usuario usuario) {
		Calendar dataNasc = new GregorianCalendar();
		dataNasc.setTime(usuario.getDataNasc());
		
		Calendar dataHoje = Calendar.getInstance();
		
		int idade = dataHoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
		
		dataNasc.add(Calendar.YEAR, idade);
		
		if(dataHoje.before(dataNasc)) {
			idade --;
		}
		return idade;
	}
	
	
	
}
