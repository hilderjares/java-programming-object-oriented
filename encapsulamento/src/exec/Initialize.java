package exec;

import model.Aluno;

public class Initialize {
	public static void main(String[] args) {
		Aluno primeiro_aluno = new Aluno();
		
		primeiro_aluno.setNome("ssh://virus.com.br");
		primeiro_aluno.setNome("https://virus.com.br");
		primeiro_aluno.setNome("Joalison");
		primeiro_aluno.setCurso("DP");
		primeiro_aluno.setIdade(-10);
		primeiro_aluno.setIra(10.00f);
		
		System.out.println(primeiro_aluno);
		//System.out.println(primeiro_aluno.toString());
	}
}
