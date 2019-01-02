package br.quixada.ufc.si.poo.model;

public class Circulo extends Figura{
	private int x;
	private int y;
	private int raio;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	@Override
	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", raio=" + raio + "]";
	}
}
