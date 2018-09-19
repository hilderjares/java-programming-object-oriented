package lista01;

public class NumeroPrimo 
{
	public static void main(String[] args) 
	{
		if(primo(2))
		{
			System.out.println("É primo!");
		}
		else
		{
			System.out.println("Não é primo!");
		}
	}
	public static boolean primo(int numero)
	{
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
