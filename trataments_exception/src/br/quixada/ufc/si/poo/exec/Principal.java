package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.exception.DivizionZeroException;
import br.quixada.ufc.si.poo.model.Calculadora;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		try {
			calc.divisao(1, 0);
		} catch (DivizionZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
