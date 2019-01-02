package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Automovel;

public class Principal {
	public static void main(String[] args) {
		Automovel carro = new Automovel(12, 4, "preto", 2, "123-AQE");
		Automovel moto = new Automovel(3, 2, "preto", 0, "789-QUE");
		
		/*
		 	carro.setCor("Preto");
			carro.setNumPortas(4);
			carro.setNumRodas(4);
			carro.setPlaca("125-AEF");
		
			carro.setCor("PRETO");
			for (int i = 0; i < carro.getCor().length(); i++) 
				System.out.println(carro.getCor().toUpperCase().charAt(i));
		*/
		System.out.println(carro);
		System.out.println(moto);
	}
}
