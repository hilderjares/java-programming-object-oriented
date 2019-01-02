package br.quixada.ufc.si.poo.model;

public class Aviao extends Brinquedo {
	@Override
	public void mover() {
		System.out.println("Move pelo ar!");
		super.mover();
	}
}
