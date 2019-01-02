package br.ufc.quixada.si.poo.model;

public class Operario extends Empregado {
	private float valorProducao;
	private int comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, float salario, int imposto,
			float valorProducao, int comissao) {
		super(nome, endereco, telefone, codigoSetor, salario, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		float adicional = this.valorProducao - (this.valorProducao * this.comissao / 100);
		return super.calcularSalario(getSalario(), adicional);
	}
}
