package lista01;

public class MetodosVoid 
{	
	public static void main(String[] args) 
	{	
		nomeMilVezes();
	}
	public static void nomeMilVezes()
	{
		String vetor [] = {"Francisco", "Hilderjares"};
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) 
			{
				System.out.println(vetor[1]);
			}
			else
			{
			System.out.println(vetor[0]);
			}
		}
	}
}
