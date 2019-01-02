package lista01;

public class AprovadoV2 
{
	public static void main(String[] args) 
	{
		System.out.println(calculaMedia(4, 4));
	}
	public static String calculaMedia(float primeira_nota, float segunda_nota)
	{
		float media = (primeira_nota + segunda_nota) / 2;
		if(media >= 7) 
		{
			return "Passou com conceito A";
		}
		if(media >= 4 && media <= 7)
		{
			if(calculaMediaFinal(media, 7))
			{
				return "Aprovado com conceito B";
			}
			return "Reprovado";
		}
		return "Reprovado";
	}
	public static boolean calculaMediaFinal(float media, float nota_final)
	{
		float media_final = (media + nota_final) / 2;
		return media_final >= 5;
	}
}
