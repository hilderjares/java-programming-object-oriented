package br.quixada.ufc.si.poo.model;

public class Terrestre extends Transporte{
	private int numRodas;
	
	public Terrestre(int capacidade, int numRodas) {
		super(capacidade);
		this.numRodas = numRodas;
		// TODO Auto-generated constructor stub
	}

	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}
}
