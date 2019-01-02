package br.quixada.ufc.si.poo.model;

public class Figura {
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void desenhar() {
		System.out.println("Pintou de " + getCor());
	}
}
