package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Circulo;
import br.quixada.ufc.si.poo.model.Triangulo;

public class Initializes {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setCor("Azul");
		c1.setX(10);
		c1.setY(5);
		c1.setRaio(3);
		c1.desenhar();
		
		Triangulo t1 = new Triangulo();
		t1.setCor("Vermelho");
		t1.setAltura(2);
		t1.setBase(5);
		t1.desenhar();
		
		System.out.println(c1);
		System.out.println(t1);
	}
}
