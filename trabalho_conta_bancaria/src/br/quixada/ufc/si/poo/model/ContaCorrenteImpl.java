package br.quixada.ufc.si.poo.model;

public class ContaCorrenteImpl extends ContaBancaria implements Imprimivel {
	private float saldoEspecial;

	public void setSaldoEspecial(float saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

	@Override
	public void sacar(float valorDoSaque) {
		float saldoAtual = getSaldoDaConta();
		
		if (valorDoSaque <= (saldoAtual + this.saldoEspecial)) {
			setSaldoDaConta(saldoAtual - valorDoSaque);
			System.out.println("Saldo realizado com suecesso");
		} else {
			System.out.println("Você não tem dinheiro suficiente para realizar o saque");
		}
	}

	@Override
	public void depositar(float valorDoDeposito) {
		float saldoAnterior = getSaldoDaConta();
		setSaldoDaConta(saldoAnterior + valorDoDeposito);
		
		if (getSaldoDaConta() >= (saldoAnterior + valorDoDeposito)) {
			System.out.println("Deposito realizado com sucesso");
		} else {
			System.out.println("Problema ao realizar deposito");
		}
	}	
	
	@Override
	public String mostrarDados() {
		String dados = "";
		dados += "Numero da Conta: " + getNumeroDaConta() + "\n";
		dados += "Saldo da Conta:  " + getSaldoDaConta() + "\n";
		dados += "Saldo epecial: " + this.saldoEspecial + "\n";
		
		return dados;
	}
}
