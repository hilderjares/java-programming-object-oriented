package br.ufc.quixada.si.poo.model;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salario;
	private int imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salario, int imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salario = salario;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public float calcularSalario(float salario, float acrescimo) {
		float salarioTotal = salario + acrescimo;
		float salarioFinal = salarioTotal - (salarioTotal * imposto / 100);
		return salarioFinal;
	}
}
