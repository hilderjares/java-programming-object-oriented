package br.quixada.ufc.si.poo.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private String matricula;
	private LocalDate dataAdmissao;
	private double salario;
	
	public Funcionario(String nome, String cpf, LocalDate dataNascimento, String matricula, LocalDate dataAdmissao,
			double salario) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}	
	
	public void mostrarFuncionario() {
		super.mostrarPessoa();
		System.out.println(this.matricula);
		System.out.println(this.dataAdmissao);
		System.out.println(this.salario);
	}
}
