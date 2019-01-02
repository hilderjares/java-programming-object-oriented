package br.quixada.ufc.si.poo.model;

public class Solo extends Thread {
	
	@Override
	public void run() {
		this.processar();
	}
	
	public void processar() {
		System.out.println("Inicio do processamento...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do processamento");
	}
}
