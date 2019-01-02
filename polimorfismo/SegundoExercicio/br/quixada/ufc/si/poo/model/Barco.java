package br.quixada.ufc.si.poo.model;

public class Barco extends Brinquedo {
	@Override
	public void mover() {
		System.out.println("Move pelo barco!");
		super.mover();
	}	
}
