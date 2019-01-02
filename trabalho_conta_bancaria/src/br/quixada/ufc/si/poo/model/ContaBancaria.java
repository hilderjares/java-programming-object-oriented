package br.quixada.ufc.si.poo.model;

public abstract class ContaBancaria {
	private int numeroDaConta;
	private float saldoDaConta;
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public float getSaldoDaConta() {
		return saldoDaConta;
	}
	public void setSaldoDaConta(float saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}

	public abstract void sacar(float valorDoSaque);
	public abstract void depositar(float valorDoDeposito);	
}
