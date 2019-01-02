package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Calculadora;

public class Initializes {
	public static void main(String[] args) {
		int primeia_soma = Calculadora.soma(23, 4);
		int segunda_soma = Calculadora.soma(33, 4, 9);
		float terceira_soma = Calculadora.soma(3.1f, 4.3f);

		System.out.println("Soma um: " + primeia_soma);
		System.out.println("Soma dois: " + segunda_soma);
		System.out.println("Soma tres: " + terceira_soma);
	}
}
