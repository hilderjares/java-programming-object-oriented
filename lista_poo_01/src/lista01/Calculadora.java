package lista01;

import java.util.Scanner;

public class Calculadora 
{	
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		float primeiro_numero, segundo_numero;
		String operacao;
		
		System.out.println("Digite o primerio número: ");
		primeiro_numero = read.nextFloat();
		System.out.println("Digite o segundo número: ");
		segundo_numero = read.nextFloat();
		System.out.println("Digite a operação: ");
		operacao = read.next().substring(0, 1); 
		
		switch (operacao) {
		case "+":
			System.out.println("O resultado da soma é: " + somar(primeiro_numero, segundo_numero));
			break;
		case "-":
			System.out.println("O resultado da subtração é: " + subtrair(primeiro_numero, segundo_numero));
			break;
		case "/":
			System.out.println("O resultado da divisão é: " + dividir(primeiro_numero, segundo_numero));
			break;
		case "*":
			System.out.println("O resultado da multiplicação é: " + multiplicar(primeiro_numero, segundo_numero));
			break;
		default:
			System.exit(0);
			break;
		}
	}
	public static float somar(float primeiro_numero, float segundo_numero)
	{
		return primeiro_numero + segundo_numero;
	}
	public static float subtrair(float primeiro_numero, float segundo_numero)
	{
		return primeiro_numero - segundo_numero;
	}
	public static float dividir(float primeiro_numero, float segundo_numero)
	{
		return primeiro_numero / segundo_numero;
	}
	public static float multiplicar(float primeiro_numero, float segundo_numero)
	{
		return primeiro_numero * segundo_numero;
	}
}
