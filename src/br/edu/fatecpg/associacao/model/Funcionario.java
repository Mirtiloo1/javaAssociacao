package br.edu.fatecpg.associacao.model;

public class Funcionario {
	String nome;
	String cargo;
	double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.salario = salario;
		this.nome = nome;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}

}


