package aula03;

import java.util.Iterator;
import java.util.Scanner;

public class Initializes 
{	
	public static Scanner read = new Scanner(System.in);
	public static void main(String [] args) 
	{
		/*
		Carro fiat = new Carro();
		fiat.modelo = "uno";
		fiat.ano = 2016;
		fiat.velocidade = 80;
		
		System.out.println("Modelo: " + fiat.modelo);
		System.out.println("Ano: " + fiat.ano);
		System.out.println("Velocidade: " + fiat.velocidade);
		
		fiat.acelerar();
		fiat.acelerar();
		
		System.out.println("Velocidade: " + fiat.velocidade);
		
		fiat.parar();
		
		System.out.println("Velocidade: " + fiat.velocidade);
		
		System.out.println("Digite a marca do carro:");
		String modelo_carro = read.nextLine();
		System.out.println("Digite o ano do carro:");
		int ano_carro = read.nextInt();
		System.out.println("Digite a velocidade:");
		double velocidade_carro = read.nextDouble();
		
		Carro audi = new Carro();
		audi.modelo = modelo_carro;
		audi.ano = ano_carro;
		audi.velocidade = velocidade_carro;
		
		System.out.println("Modelo: " + audi.modelo);
		System.out.println("Ano: " + audi.ano);
		System.out.println("Velocidade: " + audi.velocidade);
		*/
		
		try 
		{
			Carro vetor_carros[] = new Carro[3];
			
			Carro meuCarro =  new Carro();
			meuCarro.modelo = "Uno";
			meuCarro.ano = 2016;
			meuCarro.velocidade = 20;
			
			vetor_carros[0] = meuCarro;
			
			System.out.println(vetor_carros[0]);
			
			vetor_carros[0] = null;
			
			Carro fiat =  new Carro();
			fiat.modelo = "Pailo";
			fiat.ano = 2018;
			fiat.velocidade = 20;
			
			vetor_carros[0] = fiat;
			
			for (Carro carro : vetor_carros) {
				System.out.println(carro.modelo);
			}
			
			Carro.numero_de_carros = 10;
			Carro.imprimeNumeroDeCarros();
			
			int ano_carro_especifico = 2016;
			
			System.out.println("O número de carros do ano " + ano_carro_especifico + " é: " + Carro.contarCarrosAnoEspecifico(vetor_carros, ano_carro_especifico));
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}
