package br.edu.fatecpg.associacao.model;

public class Cliente {
	String nome;
	String email;
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}
	

}
