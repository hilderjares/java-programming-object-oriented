package br.quixada.ufc.si.poo.model;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public void mostrarPessoa() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
	}
}
