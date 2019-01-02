package ufc.quixada.si.poo.exec;

import ufc.quixada.si.poo.model.EntradaDeCinema;

public class ProgramaEntradaDeCinema {
	public static void main(String[] args) {
		
		EntradaDeCinema primeiraVenda = new EntradaDeCinema("Homem-Aranha", "10:20", 1, 1, 30.50f);
		EntradaDeCinema segundaVenda = new EntradaDeCinema("Homem-Aranha", "10:20", 1, 2, 30.50f);
		EntradaDeCinema terceiraVenda = new EntradaDeCinema("Homem-Aranha", "10:20", 1, 3, 30.50f);
		
		float descontoPrimeiraVenda = primeiraVenda.calculaValorComDesconto(15, 10, 2005);
		float descontoSegundaVenda = segundaVenda.calculaValorComDesconto(02, 04, 2010);
		float descontoTerceiraVenda = terceiraVenda.calculaValorComDesconto(10, 9, 1989);
		
		float descontoCarteiraEstudantePrimeiraVenda = primeiraVenda.calculaValorComDesconto(15, 04, 2007, 456);
		float descontoCarteiraEstudanteSegundaVenda = segundaVenda.calculaValorComDesconto(02, 04, 2010, 123);
		float descontoCarteiraEstudanteTerceiraVenda = terceiraVenda.calculaValorComDesconto(10, 9, 1989, 789);

		System.out.println("(ENGRESSO 1)");
		System.out.println(primeiraVenda);
		System.out.println(descontoPrimeiraVenda < primeiraVenda.getvalorOriginal() ? "O desconto foi de: " + descontoPrimeiraVenda : "Não houve descontos");
		System.out.println("Valor com o desconto da carteira: " + descontoCarteiraEstudantePrimeiraVenda);
		System.out.println(primeiraVenda.realizarVenda());
		System.out.println(primeiraVenda.realizarVenda());
		
		System.out.println("\n(ENGRESSO 2)");
		System.out.println(segundaVenda);
		System.out.println(descontoSegundaVenda < segundaVenda.getvalorOriginal() ? "O desconto foi de: " + descontoSegundaVenda : "Não houve descontos");
		System.out.println("Valor com o desconto da carteira: " + descontoCarteiraEstudanteSegundaVenda);
		System.out.println(segundaVenda.realizarVenda());
		System.out.println(segundaVenda.realizarVenda());
		
		System.out.println("\n(ENGRESSO 3)");
		System.out.println(terceiraVenda);
		System.out.println(descontoTerceiraVenda < terceiraVenda.getvalorOriginal() ? "O desconto foi de: " + descontoTerceiraVenda : "N�o houve descontos");
		System.out.println("Valor com o desconto da carteira: " + descontoCarteiraEstudanteTerceiraVenda);
		System.out.println(terceiraVenda.realizarVenda());
		System.out.println(terceiraVenda.realizarVenda());

	}
}
