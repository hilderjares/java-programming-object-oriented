package aula03;

public class Carro 
{
	String modelo;
	int ano;
	double velocidade;
	static int numero_de_carros = 0;
	
	public static int contarCarrosAnoEspecifico(Carro vetor_carros[], int ano_carro)
	{	
		int numero_carros = 0;
		for (Carro carro : vetor_carros) 
		{
			if(carro.ano == ano_carro) numero_carros += 1;
		}
		return numero_carros;
	}
	
	public static void imprimeNumeroDeCarros()
	{
		System.out.println("O numero de carros é: " + numero_de_carros);
	}
	
	public void acelerar() 
	{
		this.velocidade += 10;
	}
	
	public void frear()
	{
		this.velocidade -= 10;
	}
	
	public void parar()
	{
		this.velocidade = 0;
	}
}
