package br.quixada.ufc.si.poo.model;

public class Pessoa {
	private String endereco;
	private String email;
	private String nome;
	
	public Pessoa() { }

	public Pessoa(String endereco, String email, String nome) {
		this.endereco = endereco;
		this.email = email;
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
