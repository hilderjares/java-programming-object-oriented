package br.quixada.ufc.si.poo.model;

public class Carro extends Brinquedo {
	@Override
	public void mover() {
		System.out.println("Move pela terra!");
		super.mover();
	}
}
