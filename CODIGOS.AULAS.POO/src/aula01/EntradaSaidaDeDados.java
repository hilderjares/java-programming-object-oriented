package aula01;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSaidaDeDados
{
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args)
	{	
		// Scanner read = new Scanner(System.in);
		System.out.println("Digite o seu sonho ?");
		String s = read.nextLine();
		//System.err.println(s.toUpperCase(Locale.ROOT));
		System.err.println("\"Esse sonho "+ s +" é impossivel\"");
		
		int i = read.nextInt();
		String a = read.next();
		
		System.out.println("Digite sua nota: ");
		double nota = read.nextDouble();
		read.useLocale(Locale.US);
		System.out.println(nota);
		
		String b = "3 ";
		String c = "4 ";
		String d = b + c;
		System.out.println(d);
	}
}
