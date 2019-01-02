package br.ufc.quixada.si.poo.model;

public class Vendedor extends Empregado {
	private float valorVendas;
	private float comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salario, int imposto,
			float valorVendas, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salario, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		float acrescimo = this.valorVendas - (this.valorVendas * this.comissao / 100);
		float salario = getSalario();
		return super.calcularSalario(salario, acrescimo);
	}
}
