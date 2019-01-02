package aula02;

import java.util.Iterator;

public class EstruturaDeDecisao
{
	public static void main(String[] args)
	{	
		/*/
			if(condicional)
			{
				 #code 
			}else
			{
				 #code
			}
		/*/
		
		if(!true)
		{
			System.out.println("Entrou no if");
		}else
		{
			System.out.println("Não entrou no if");
		}
		
		int opcao = 1;
		switch (opcao) 
		{
		case 1:
			System.out.println("Essa é a primeira opção");
			break;

		default:
			System.out.println("Opção inexistente");
			break;
		}
		
	}
}
