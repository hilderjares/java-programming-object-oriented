package br.quixada.ufc.si.poo.controll;

public class AreaCritica {
	public synchronized void acessa(String nome, int tempo) {
		System.out.println(nome + " entrando na região critica");
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " saindo da região critica");
	}
}
