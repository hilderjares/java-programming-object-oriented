package br.ufc.quixada.si.poo.model;

public class Administrador extends Empregado {
	private float ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salario, int imposto,
			float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salario, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public float calcularSalario() {
		return super.calcularSalario(getSalario(), getAjudaDeCusto());
	}
}
