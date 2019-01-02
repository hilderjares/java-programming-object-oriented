package br.quixada.ufc.si.poo.exec;

import java.util.Scanner;

import br.quixada.ufc.si.poo.model.Agenda;
import br.quixada.ufc.si.poo.model.Pessoa;
import br.quixada.ufc.si.poo.model.PessoaFisica;
import br.quixada.ufc.si.poo.model.PessoaJuridica;

public class Principal {
	public static Agenda agenda = new Agenda();
	public static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {	
		String opcao;
		boolean continuar = true;
		do {
			System.out.println("Digite uma opção (s - sair) (h - help) ");
			System.out.print(">> ");
			opcao = scanf.next();
		
			switch (opcao) {
				case "h":
					help();
					break;
					
				case "add_j": 
					adicionarPessoaJuridica();
					break;
				
				case "add_f":
					adicionarPessoaFisica();
					break;
					
				case "rm_j":
					deletarPessoaJuridica();	
					break;
					
				case "rm_f":
					deletarPessoaFisica();
					break;
				
				case "list": 
					listarPessoas();
					break;
				
				case "sort":
					ordenarPessoas();
					break;
					
				case "p_nome":
					pesquisarPorNome();
					break;
				
				case "p_cpf":
					pesquisarPorCpf();
					break;
					
				case "p_cnpj":
					pesquisarPorCnpj();
					break;
					
				case "s":
					continuar = false;
					break;
					
				default:
					System.out.println("Operação não existe");
					break;
			}

		} while (continuar);
	}
	
	public static void ordenarPessoas() {
		try {
			agenda.ordenar();
			agenda.listar();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void listarPessoas() {
		try {
			agenda.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void adicionarPessoaJuridica() {
		System.out.println("Digite o endereço: ");
		String endereco = scanf.next(); 
		System.out.println("Digite o email: ");
		String email = scanf.next();
		System.out.println("Digite o nome: ");
		String nome = scanf.next();
		System.out.println("Digite o cnpj: ");
		int cnpj = scanf.nextInt();
		System.out.println("Digite a inscrição estudal: ");
		String inscricaoEstadual = scanf.next();
		System.out.println("Digite a razão social: ");
		String razaoSocial = scanf.next();
		
		Pessoa pessoaJuridica = new PessoaJuridica(endereco, email, nome, cnpj, inscricaoEstadual, razaoSocial);
		try {
			if (agenda.adicionar(pessoaJuridica)) {
				System.out.println("Pessao juridica adicionada com sucesso");
			} else {
				System.out.println("Error ao adicionar pessoa juridica");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void adicionarPessoaFisica() {
		System.out.println("Digite o endereço: ");
		String endereco = scanf.next(); 
		System.out.println("Digite o email: ");
		String email = scanf.next();
		System.out.println("Digite o nome: ");
		String nome = scanf.next();
		System.out.println("Digite o cpf: ");
		int cpf = scanf.nextInt();
		System.out.println("Digite a data nascimento: ");
		String dataNascimento = scanf.next();
		System.out.println("Digite o estado civil: ");
		String estadoCivil = scanf.next();
		
		Pessoa pessoaFisica = new PessoaFisica(endereco, email, nome, cpf, dataNascimento, estadoCivil);
		try {
			if (agenda.adicionar(pessoaFisica)) {
				System.out.println("Pessao fisica adicionada com sucesso");
			} else {
				System.out.println("Error ao adicionar pessoa fisica");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deletarPessoaFisica() {
		try {
			System.out.print("Digite o cpf da pessoa fisica >> ");
			int cpf = scanf.nextInt();
			if (agenda.deletarPessoaFisica(cpf)) {
				System.out.println("Pessoa juridica deletada com sucesso");
			} else {
				System.out.println("Não foi possivel deletar a pessoa fisica");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deletarPessoaJuridica() {
		try {
			System.out.print("Digite o cnpj da pessoas juridica >> ");
			int cnpj = scanf.nextInt();
			if (agenda.deletarPessoaJuridica(cnpj)) {
				System.out.println("Pessoa juridica deletada com sucesso");
			} else {
				System.out.println("Não foi possivel deletar a pessoa juridica");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pesquisarPorCnpj() {
		try {
			System.out.print("Digite o cnpj >> ");
			int cnpj = scanf.nextInt();
			agenda.procurarPorCnpj(cnpj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pesquisarPorCpf() {
		try {
			System.out.print("Digite o cpf >> ");
			int cpf = scanf.nextInt();
			agenda.procurarPorCpf(cpf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void pesquisarPorNome() {
		try {
			System.out.print("Digite o nome da pessoa >> ");
			String nome = scanf.next();
			agenda.procuarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void help() {
		System.out.println("[list - listar]");
		System.out.println("[sort - ordenar]");
		System.out.println("[add_j - adicionar pessoa juridica]");
		System.out.println("[add_f - adicionar pessoa fisica]");
		System.out.println("[rm_j - deletar pessoa fisica]");
		System.out.println("[rm_f - deletar pessoa juridica]");
		System.out.println("[p_nome - pesquisar por nome]");
		System.out.println("[p_cpf - pesquisar por cpf]");
		System.out.println("[p_cnpj - pesquisar por cnpj]");
	}

}
