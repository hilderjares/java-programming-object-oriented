package br.quixada.ufc.si.poo.model;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente() { }
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float darNotaAoMotorista(Motorista motorista, float nota) {
		motorista.setNota(nota);
		return motorista.getNota();
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", cpf=" + cpf + "]";
	}
}
