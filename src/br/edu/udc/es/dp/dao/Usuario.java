package br.edu.udc.es.dp.dao;

public class Usuario implements IEntity<Long> {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public Long getID() {
		return this.id;
	}
	@Override
	public void setID(Long id) {
		this.id = id;
	}
}
