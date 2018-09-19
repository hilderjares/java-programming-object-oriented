package br.quixada.ufc.si.poo.model;

public class Corrida {
	private String partida;
	private String destino;
	private float precoKm;
	private float precoCorrida;
	
	public Corrida() { }
	
	public Corrida(String partida, String destino, float precoKm, float precoCorrida) {
		this.partida = partida;
		this.destino = destino;
		this.precoKm = precoKm;
		this.precoCorrida = precoCorrida;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPrecoKm() {
		return precoKm;
	}

	public void setPrecoKm(float precoKm) {
		this.precoKm = precoKm;
	}

	public float getPrecoCorrida() {
		return precoCorrida;
	}

	public void setPrecoCorrida(float precoCorrida) {
		this.precoCorrida = precoCorrida;
	}
	
	public float calcularValorCorrida(int distancia) {
		return (distancia * this.precoKm) + 5;
	}

	@Override
	public String toString() {
		return "Corrida [partida=" + partida + ", destino=" + destino + ", precoKm=" + precoKm + ", precoCorrida="
				+ precoCorrida + "]";
	}
}
