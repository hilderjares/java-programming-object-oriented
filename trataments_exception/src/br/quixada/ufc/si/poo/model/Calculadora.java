package br.quixada.ufc.si.poo.model;

import br.quixada.ufc.si.poo.exception.DivizionZeroException;

public class Calculadora {
	public int soma(int primeiro_valor, int segundo_valor) {
		return primeiro_valor + segundo_valor;
	}
	
	public int subtracao(int primeiro_valor, int segundo_valor) {
		return primeiro_valor + segundo_valor; 
	}
	
	public int divisao(int primeiro_valor, int segundo_valor) throws DivizionZeroException {
		if (segundo_valor == 0) {
			throw new DivizionZeroException("Tentou fazer divisão por O");
		} 
		return primeiro_valor / segundo_valor;			
	}
	
	public int multiplicacao(int primeiro_valor, int segundo_valor) {
		return primeiro_valor * segundo_valor;
	}
}
