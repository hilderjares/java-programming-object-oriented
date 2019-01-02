package br.quixada.ufc.si.poo.controll;

public class Consumidor extends Thread {
	private AreaCritica ac;
	private String nome;
	private int tempo;
	
	public Consumidor(AreaCritica ac, String nome, int tempo) {
		this.ac = ac;
		this.nome = nome;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		this.ac.acessa(this.nome, this.tempo);
	}
}
