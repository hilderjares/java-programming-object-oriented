package br.ufc.quixada.si.poo.exec;

import br.ufc.quixada.si.poo.model.Aluno;

public class Main {
	public static void main(String args[]) {
		Aluno primeiro_aluno = new Aluno();
		Aluno segundo_aluno = new Aluno("Francisco");
		Aluno terceiro_aluno = new Aluno("João", "FIC");
		Aluno quarto_aluno = new Aluno("Maria", "UFMG", 19);
	}
}
