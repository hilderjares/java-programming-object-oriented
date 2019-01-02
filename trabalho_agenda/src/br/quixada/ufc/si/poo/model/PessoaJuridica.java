package br.quixada.ufc.si.poo.model;

public class PessoaJuridica extends Pessoa {
	private int cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	public PessoaJuridica() { }

	public PessoaJuridica(String endereco, String email, String nome, int cnpj, String inscricaoEstadual, String razaoSocial) {
		super(endereco, email, nome);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String toString() {
		String dados = "";
		dados += "{Pessoa Juridica} = ";
		dados += "Nome: " + getNome() + " | ";
		dados += "Endereco : " + getEndereco() + " | ";
		dados += "Email: " + getEmail() + " | ";
		dados += "CNPJ: " + this.cnpj + " | ";
		dados += "Inscrição Estadual : " + this.inscricaoEstadual + " | ";
		dados += "Razão Social : " + this.razaoSocial + " | ";
		
		return dados;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}	
}
