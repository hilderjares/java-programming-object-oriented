package br.quixada.ufc.si.poo.model;

import java.time.LocalDate;

public class ChefeDepartamento extends Funcionario{
	private String departamento;
	private LocalDate dataPromocao;
	private double gratificacao;
	
	public ChefeDepartamento(String nome, String cpf, LocalDate dataNascimento, String matricula,
			LocalDate dataAdmissao, double salario, String departamento, LocalDate dataPromocao, double gratificacao) {
		super(nome, cpf, dataNascimento, matricula, dataAdmissao, salario);
		this.departamento = departamento;
		this.dataPromocao = dataPromocao;
		this.gratificacao = gratificacao;
	}
	
	public void mostrarChefe() {
		super.mostrarFuncionario();
		System.out.println(this.departamento);
		System.out.println(this.dataPromocao);
		System.out.println(this.gratificacao);
	}
}
