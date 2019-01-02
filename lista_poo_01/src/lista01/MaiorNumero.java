package lista01;

public class MaiorNumero 
{	
	public static void main(String[] args) 
	{
		System.out.println("O maior número é: " + calculaMaior(10, 26));
	}
	public static int calculaMaior(int primeiro_numero, int segundo_numero)
	{
		if (primeiro_numero > segundo_numero)
		{
			return primeiro_numero;
		} 
		if(segundo_numero > primeiro_numero)
		{	
			return segundo_numero;
		}
		return primeiro_numero;
	}
}
