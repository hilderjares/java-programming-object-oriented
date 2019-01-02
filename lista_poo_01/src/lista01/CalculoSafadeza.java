package lista01;

import java.util.Scanner;

public class CalculoSafadeza 
{	
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int ano_nascimento, mes_nascimento, dia_nascimento;
		
		System.out.println("Digite o ano que você nasceu: ");
		ano_nascimento = read.nextInt();
		System.out.println("Digite o mês que você nasceu: ");
		mes_nascimento = read.nextInt();
		System.out.println("Digite o dia que você nasceu: ");
		dia_nascimento = read.nextInt();
		
		wesleySafado(ano_nascimento, mes_nascimento, dia_nascimento);
		
	}
	public static void wesleySafado(int ano, int mes, int dia) 
	{
		float safadeza, anjo;
		
		safadeza = somatorio(mes) + (ano / 100) * (50 - dia);
		anjo = 100 - (safadeza / 100);
		
		System.out.println("Sua porcentagem de safadeza é: " + safadeza + "%");
		System.out.println("Sua porcentagem de anjo é: " + anjo + "%");
		
	}
	public static int somatorio(int numero)
	{
		int somatorio = 0;
		for (int i = 1; i <= numero; i++) somatorio += i;
		return somatorio;
	}
}
