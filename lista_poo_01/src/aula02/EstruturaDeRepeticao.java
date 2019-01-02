package aula02;

public class EstruturaDeRepeticao 
{
	public static void main(String[] args) 
	{	
		System.out.println("Iteração com o FOR");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Iteração com o WHILE");
		int indice = 0;
		while (indice < 10) 
		{	
			System.out.println(indice);
			indice += 1;
		}
		
		System.out.println("Iterando vetor");
		int vetor [] = {1, 4, 6, 7};
		for (int i : vetor) {
			System.out.println(i);
		}
	}
}
