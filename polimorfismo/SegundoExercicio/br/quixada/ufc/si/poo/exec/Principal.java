package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Aviao;
import br.quixada.ufc.si.poo.model.Barco;
import br.quixada.ufc.si.poo.model.Brinquedo;
import br.quixada.ufc.si.poo.model.Carro;

public class Principal {
	public static void main(String[] args) {
		Brinquedo carro = new Carro();
		Brinquedo barco = new Barco();
		Brinquedo aviao = new Aviao();
		
		carro.mover();
		barco.mover();
		aviao.mover();
	}
}
