package br.quixada.ufc.si.poo.model;

public class Motorista {
	private String nome;
	private String cnh;
	private String placa;
	private float nota;
	
	public Motorista() { }
	
	public Motorista(String nome, String cnh, String placa) {
		this.nome = nome;
		this.cnh = cnh;
		this.placa = placa;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public void realizarCorrida(Cliente cliente, Corrida corrida) {
		System.out.println("Nome Cliente: " + cliente.getNome() + 
						   " Nome Motorista: " + getNome() + 
						   " Nota Motorista: " + getNota() +
						   " Parida: " + corrida.getPartida() + 
						   " Destino: " + corrida.getDestino());                  
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", cnh=" + cnh + ", placa=" + placa + ", nota=" + nota + "]";
	}
}
