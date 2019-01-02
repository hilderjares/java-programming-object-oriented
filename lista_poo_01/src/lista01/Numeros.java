package lista01;

public class Numeros 
{
	public static void main(String[] args)
	{
		System.out.println(verificaParImpar(10, 13));
	}
	public static String verificaParImpar(int primeiro_numero, int segundo_numero)
	{
		boolean primeiro = primeiro_numero % 2 == 0;
		boolean segundo = segundo_numero % 2 == 0;
		
		if(primeiro && segundo)
		{
			return "AZUL";
		}
		if(!primeiro && !segundo)
		{
			return "VERMELHO";
		}
		if((primeiro && !segundo) || (segundo && !primeiro))
		{
			return "AMARELO";
		}
		return "BRANCO";
	}
}
