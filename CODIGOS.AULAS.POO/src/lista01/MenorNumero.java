package lista01;

public class MenorNumero 
{

	public static void main(String[] args) 
	{
		System.out.println("O menor número é: " + calculaMaior(10, 5));
	}
	public static int calculaMaior(int primeiro_numero, int segundo_numero)
	{
		if (primeiro_numero < segundo_numero)
		{
			return primeiro_numero;
		} 
		if(segundo_numero < primeiro_numero)
		{	
			return segundo_numero;
		}
		return primeiro_numero;
	}
}
