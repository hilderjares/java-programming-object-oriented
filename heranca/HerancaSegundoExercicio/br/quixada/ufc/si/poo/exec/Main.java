package br.quixada.ufc.si.poo.exec;

import java.time.LocalDate;

import br.quixada.ufc.si.poo.model.Aluno;
import br.quixada.ufc.si.poo.model.Pessoa;
import br.quixada.ufc.si.poo.model.ChefeDepartamento;
import br.quixada.ufc.si.poo.model.Funcionario;

public class Main {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2018, 8, 21);
		
		Pessoa primeiraPessoa = new Pessoa("Carlos", "1111", data);
		Aluno primeiroAluno = new Aluno("Leticia", "1111", data, "111");
		ChefeDepartamento primeiroChefe = new ChefeDepartamento("Hilderjares", "456", data, "456", data, 1589.60, "vendas", data, 200);
		Funcionario primeiroFuncionario = new Funcionario("Lyo", "1546", data, "9851", data, 900);
		
		primeiraPessoa.mostrarPessoa();
		primeiroAluno.mostrarAluno();
		primeiroFuncionario.mostrarFuncionario();
		primeiroChefe.mostrarChefe();
		
	}
}
