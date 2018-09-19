package model;

public class Aluno 
{
	private String nome;
	private String curso;
	private int idade;
	private float ira;
	
	public Aluno() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		if(nome.startsWith("https://") || nome.startsWith("ssh://"))
		{
			this.nome = "nome é velído";
		}
		else
		{
			this.nome = nome;
		}
	}
	
	public String getCurso()
	{	
		return this.curso;
	}
	
	public void setCurso(String curso)
	{	
		if(curso.equals("SI") || 
		   curso.equals("ES") || 
		   curso.equals("CC") || 
		   curso.equals("DD") ||
		   curso.equals("EC") ||
		   curso.equals("RC"))
		{
			this.curso = curso;
		}
		else
		{
			this.curso = "curso não é valído";
		}
	}
	
	public int getIdade()
	{
		return this.idade;
	}
	
	public void setIdade(int idade)
	{	
		if(idade < 0)
		{
			this.idade = 0;
		}
		else
		{
			this.idade = idade;
		}
	}
	
	public float getIra() 
	{
		return this.ira;
	}
	
	public void setIra(float ira) 
	{	
		if(ira < 0.0 || ira > 10.0)
		{
			this.ira = 0.0f;
		}
		else
		{
			this.ira = ira;
		}
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		String informacoes_aluno = "";
		
		informacoes_aluno += "Nome: " + getNome() + "\n";
		informacoes_aluno += "Curso: " + getCurso() + "\n";
		informacoes_aluno += "Idade: " + getIdade() + "\n";
		informacoes_aluno += "IRA: " + getIra() + "\n";
		
		return informacoes_aluno;
	}
}
