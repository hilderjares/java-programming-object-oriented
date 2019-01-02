package lista01;

public class Fatorial 
{
	public static void main(String[] args) 
	{	
		System.out.println("O fatorial de 5 é: " + fatorial(5));
	}
	public static int fatorial(int numero)
	{
		if(numero == 0)
		{
			return 1;
		}
		return numero * fatorial(numero - 1);
	}
}
