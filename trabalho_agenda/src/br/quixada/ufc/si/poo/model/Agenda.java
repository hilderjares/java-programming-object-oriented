package br.quixada.ufc.si.poo.model;

public class Agenda {
	
	private Pessoa pessoas[];
	private static PessoaJuridica pessoas_juridicas[];
	private static PessoaFisica pessoas_fisicas[];
	
	private static int indice = 0;
	
	public Agenda() {
		pessoas = new Pessoa[50];
		pessoas_juridicas = new PessoaJuridica[50];
		pessoas_fisicas = new PessoaFisica[50];
	}
	
	public void listar() {
		for (int i = 0; i < indice; i++) {
			System.out.println(pessoas[i].toString());
		}
	}
	
	public void ordenar() {
		try {			
			int cont_pessoas_fisicas = 0, cont_pessoas_juridicas = 0;
			for (int i = 0; i < indice; i++) {
				if (pessoas[i] instanceof PessoaFisica) {
					pessoas_fisicas[cont_pessoas_fisicas] = (PessoaFisica)pessoas[i]; 
					cont_pessoas_fisicas += 1;
				} else {
					pessoas_juridicas[cont_pessoas_juridicas] = (PessoaJuridica)pessoas[i];
					cont_pessoas_juridicas += 1;
				}
			}
			ordenaPessoaJuridica(pessoas_juridicas, cont_pessoas_juridicas);
			ordenaPessoaFisica(pessoas_fisicas, cont_pessoas_fisicas);
			
			System.arraycopy(pessoas_juridicas, 0, pessoas, 0, cont_pessoas_juridicas); 
			System.arraycopy(pessoas_fisicas, 0, pessoas, cont_pessoas_juridicas, cont_pessoas_fisicas);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ordenaPessoaJuridica(PessoaJuridica pessoa_juridica[], int size) {
		PessoaJuridica aux_j = null;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (pessoa_juridica[j].getCnpj() > pessoa_juridica[j + 1].getCnpj()) {
					aux_j = pessoa_juridica[j];
					pessoa_juridica[j] = pessoa_juridica[j + 1];
					pessoa_juridica[j + 1] = aux_j;
				}
			} 
		}
	}
	
	public static void ordenaPessoaFisica(PessoaFisica pessoa_fisica[], int size) {
		PessoaFisica aux_f = null;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (pessoa_fisica[j].getCpf() > pessoa_fisica[j + 1].getCpf()) {
					aux_f = pessoa_fisica[j];
					pessoa_fisica[j] = pessoa_fisica[j + 1];
					pessoa_fisica[j + 1] = aux_f;
				}
			} 
		}
	}
	
	public boolean adicionar(Pessoa pessoa) throws Exception {
		if (indice < 50) {
			pessoas[indice] = pessoa;
			indice = indice + 1;
			return true;
		}
		return false;
	}
	
	public boolean deletarPessoaFisica(int cpf) throws Exception {	
		int indice_deletar = -1;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i] instanceof PessoaFisica) {
				if (((PessoaFisica) pessoas[i]).getCpf() == cpf) {
					indice_deletar = i;
					break;
				}
			}
		}
		if (indice_deletar >= 0) {
			for (int i = indice_deletar; i < indice - 1; i++) 
				pessoas[i] = pessoas[i + 1];
			indice -= 1;
			return true;
		}
		return false;
	}
	
	public boolean deletarPessoaJuridica(int cnpj) throws Exception {
		int indice_deletar = -1;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i] instanceof PessoaJuridica) {
				if (((PessoaJuridica) pessoas[i]).getCnpj() == cnpj) {
					indice_deletar = i;
					break;
				}
			}
		}
		if (indice_deletar >= 0) {
			for (int i = indice_deletar; i < indice - 1; i++) 
				pessoas[i] = pessoas[i + 1];
			indice -= 1;
			return true;
		}
		return false;
	}
	
	public void procuarPorNome(String nome) throws Exception {
		boolean encontrada = false;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
				encontrada = true;
				System.out.println(pessoas[i].toString());
				break;
			}
		}
		if (encontrada == false) {
			System.out.println("Lista vazia ou pessoa não encontrada");
		} 
	}
	
	public void procurarPorCpf(int cpf) throws Exception {
		boolean encontrada = false;
		for (int i = 0; i < indice; i++) {
			if (((PessoaFisica)pessoas[i]).getCpf() == cpf) {
				encontrada = true;
				System.out.println(pessoas[i].toString());
				break;
			}
		}
		if (encontrada == false) {
			System.out.println("Lista vazia ou pessoa não encontrada");
		} 
	}
	
	public void procurarPorCnpj(int cnpj) throws Exception {
		boolean encontrada = false;
		for (int i = 0; i < indice; i++) {
			if (((PessoaJuridica)pessoas[i]).getCnpj() == cnpj) {
				encontrada = true;
				System.out.println(pessoas[i].toString());
				break;
			}
		}
		if (encontrada == false) {
			System.out.println("Lista vazia ou pessoa não encontrada");
		} 
	}
}
