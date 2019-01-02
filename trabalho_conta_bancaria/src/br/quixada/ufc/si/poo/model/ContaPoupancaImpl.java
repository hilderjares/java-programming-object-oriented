package br.quixada.ufc.si.poo.model;

public class ContaPoupancaImpl extends ContaBancaria implements Imprimivel {
	private float taxaDeOperacao;

	public void setTaxaDeOperacao(float taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	@Override
	public void sacar(float valorDoSaque) {
		float saldoAtual = getSaldoDaConta();
		
		if ((valorDoSaque + taxaDeOperacao) >= saldoAtual) {
			setSaldoDaConta((saldoAtual - valorDoSaque) - this.taxaDeOperacao);
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Você não tem dinheiro suficiente para realizar o saque");
		}
	}

	@Override
	public void depositar(float valorDoDeposito) {
		float saldoAnterior = getSaldoDaConta();
		setSaldoDaConta(saldoAnterior + valorDoDeposito);
		setSaldoDaConta(getSaldoDaConta() - this.taxaDeOperacao); 
		
		if (getSaldoDaConta() >= ((saldoAnterior + valorDoDeposito) - this.taxaDeOperacao)) {
			System.out.println("Deposito realizado com sucesso");
		} else {
			System.out.println("Problema ao realizar o deposito");
		}
	}	
	
	@Override
	public String mostrarDados() {
		String dados = "";
		dados += "Numero da Conta: " + getNumeroDaConta() + "\n";
		dados += "Saldo da Conta:  " + getSaldoDaConta() + "\n";
		dados += "Saldo epecial: " + this.taxaDeOperacao + "\n";
		
		return dados;
	}
}
