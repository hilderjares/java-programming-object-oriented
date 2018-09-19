package lista01;

public class AprovadoV1 
{
	public static void main(String[] args) 
	{
		if (media(6, 7)) 
		{
			System.out.println("Passou com conceito A");
		} 
		else 
		{
			System.out.println("Não passou com conceito A");
		}
	}
	public static boolean media(float primeira_nota, float segunda_nota)
	{
		float media = (primeira_nota + segunda_nota) / 2;
		return media >= 7;
	}
}
