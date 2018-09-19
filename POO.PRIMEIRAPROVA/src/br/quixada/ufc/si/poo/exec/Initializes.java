package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.model.Cliente;
import br.quixada.ufc.si.poo.model.Corrida;
import br.quixada.ufc.si.poo.model.Motorista;

public class Initializes {
	public static void main(String[] args) {
		
		Cliente primeiro_cliente = new Cliente("Franciso", "1111");
		Cliente segundo_cliente = new Cliente("Maria", "222");
		Cliente terceiro_cliente = new Cliente("José", "333");
		
		Corrida primeira_corrida = new Corrida("Quixadá", "Fortaleza", 12.4f, 20.0f);
		Corrida segunda_corrida = new Corrida("Quixadá", "Barbalha", 12.0f, 25.0f);
		Corrida terceira_corrida = new Corrida("Iguatu", "Cedro", 10.0f, 15.0f);
		
		Motorista primeiro_motorista = new Motorista("Jack", "111A", "19TY");
		Motorista segundo_motorista = new Motorista("Luan", "222B", "20LY");
		Motorista terceiro_motorista = new Motorista("Bruce", "333C", "13IU");
		
		primeiro_cliente.darNotaAoMotorista(primeiro_motorista, 6.7f);
		segundo_cliente.darNotaAoMotorista(segundo_motorista, 9.0f);
		terceiro_cliente.darNotaAoMotorista(terceiro_motorista, 9);
		
		primeiro_motorista.realizarCorrida(primeiro_cliente, primeira_corrida);
		segundo_motorista.realizarCorrida(segundo_cliente, segunda_corrida);
		terceiro_motorista.realizarCorrida(terceiro_cliente, terceira_corrida);
		
		float calculo_primeira_corrida = primeira_corrida.calcularValorCorrida(12);
		float calculo_segunda_corrida = segunda_corrida.calcularValorCorrida(9);
		float calculo_terceira_corrida = terceira_corrida.calcularValorCorrida(10);
		
		System.out.println();
		
		System.out.println("Cleinte 01: " + primeiro_cliente);
		System.out.println("Cleinte 02: " + segundo_cliente);
		System.out.println("Cleinte 03: " + terceiro_cliente);
		
		System.out.println();
		
		System.out.println("Corrida 01: " + primeira_corrida);
		System.out.println("Corrida 02: " + segunda_corrida);
		System.out.println("Corrida 03: " + terceira_corrida);
		
		System.out.println();
		
		System.out.println("Motorista 01: " + primeiro_motorista);
		System.out.println("Motorista 02: " + segundo_motorista);
		System.out.println("Motorista 03: " + terceiro_motorista);
		
		System.out.println();
		
		System.out.println("Valor Corida 01 " + calculo_primeira_corrida);
		System.out.println("Valor Corida 02 " + calculo_segunda_corrida);
		System.out.println("Valor Corida 03 " + calculo_terceira_corrida);
		
	}
}
