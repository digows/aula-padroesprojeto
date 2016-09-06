package br.edu.udc.es.dp.activerecord;

import java.util.Calendar;

public class Pessoa extends AbstractEntity {
	
	private String nome;
	private String email;
	private Calendar nascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
}
