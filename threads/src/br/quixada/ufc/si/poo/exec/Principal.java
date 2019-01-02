package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Solo;

public class Principal {
	public static void main(String[] args) {
		Solo s1 = new Solo();
		Solo s2 = new Solo();
		Solo s3 = new Solo();
		
		long inicio = getTime();
		//s1.processar();
		//s2.processar();
		//s3.processar();
		s1.start();
		s2.start();
		s3.start();
		try {
			s1.join();
			s2.join();
			s3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long fim = getTime();
		
		System.out.println("O tempo da execução foi: " + (fim - inicio) + " ms");
	}
	
	public static long getTime() {
		return (new java.util.Date()).getTime();
	}
}
