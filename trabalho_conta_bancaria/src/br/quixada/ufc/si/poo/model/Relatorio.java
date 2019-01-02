package br.quixada.ufc.si.poo.model;

public class Relatorio {
	public void gerarRelatorio(Object conta) {
		try {
			if (conta instanceof ContaCorrenteImpl) {
				System.out.println(((ContaCorrenteImpl) conta).mostrarDados());
			} else {
				System.out.println(((ContaPoupancaImpl) conta).mostrarDados());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
