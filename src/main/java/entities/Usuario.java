package entities;

import java.util.Date;

public class Usuario {
	
	private String nome;

	private Date dataNasc;

	private Float altura;

	public Usuario() {
	}

	public Usuario(String nome, Date dataNasc, Float altura) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", dataNasc=" + dataNasc + ", altura=" + altura + "]";
	}
}
