package br.quixada.ufc.si.poo.model;

public class PessoaFisica extends Pessoa {
	private int cpf;
	private String dataNascimento;
	private String estadoCivil;
	
	public PessoaFisica() { }

	public PessoaFisica(String endereco, String email, String nome, int cpf, String dataNascimento, String estadoCivil) {
		super(endereco, email, nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		String dados = "";
		dados += "{Pessoa Fisica} = ";
		dados += "Nome: " + getNome() + " | ";
		dados += "Endereco : " + getEndereco() + " | ";
		dados += "Email: " + getEmail() + " | ";
		dados += "CPF: " + this.cpf + " | ";
		dados += "Data Nascimento : " + this.dataNascimento + " | ";
		dados += "Estado Civil : " + this.estadoCivil + " | ";
		
		return dados;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	} 
}
