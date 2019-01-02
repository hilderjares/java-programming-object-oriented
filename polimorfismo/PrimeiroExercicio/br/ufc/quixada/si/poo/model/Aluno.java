package br.ufc.quixada.si.poo.model;

public class Aluno {
	private String nome;
	private String instituicao;
	private int idade;
	
	public Aluno() {
		this("Sem nome", "UFC", 17);
	}
	
	public Aluno(String nome) {
		this(nome, "UFC", 17);
	}
	
	public Aluno(String nome, String instituicao) {
		this(nome, instituicao, 17);
	}
	
	public Aluno(String nome, String instituicao, int idade) {
		this.nome = nome;
		this.instituicao = instituicao;
		this.idade = idade;
	}
}
