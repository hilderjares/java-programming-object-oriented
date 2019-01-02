package ufc.quixada.si.poo.model;

public class EntradaDeCinema {
	private String titulo;
	private String horario;
	private int sala;
	private int poltrona;
	private float valorOriginal;
	private boolean disponivel = true;
	
	private int diaAtual = 03;
	private int mesAtual = 8;
	private int anoAtual = 2018;
	
	public EntradaDeCinema(String titulo, String horario, int sala, int poltrona, float valorOriginal) {
		this.titulo = titulo;
		this.horario = horario;
		this.sala = sala;
		this.poltrona = poltrona;
		this.valorOriginal = valorOriginal;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public int getSala() {
		return sala;
	}
	
	public int getPoltrona() {
		return poltrona;
	}
	
	public float getvalorOriginal() {
		return valorOriginal;
	}
	
	public float calculaValorComDesconto(int dia, int mes, int ano) {	
		if (dia < diaAtual && mes < mesAtual && ((anoAtual - ano) < 12) || ((anoAtual - ano) < 12 - 1)) {
			return getvalorOriginal() - (getvalorOriginal() * 0.5f);
		}
		return getvalorOriginal();  
	}
	
	public float calculaValorComDesconto(int dia, int mes, int ano, int carteiraEstudante) {	
		if ((dia <= diaAtual && mes <= mesAtual && (((anoAtual - ano) >= 12) && ((anoAtual - ano) <= 15))) || ((anoAtual - ano) <= 14)) {
			return getvalorOriginal() - (getvalorOriginal() * 0.4f);
		} else if (dia <= diaAtual && mes <= mesAtual && (((anoAtual - ano) >= 16) && ((anoAtual - ano) <= 20)) || ((anoAtual - ano) <= 19)) {
			return getvalorOriginal() - (getvalorOriginal() * 0.3f);
		} else if ((anoAtual - ano) > 20) {
			return getvalorOriginal() - (getvalorOriginal() * 0.2f);
		}
		return getvalorOriginal(); 
	}
	
	public String realizarVenda() {
		if (this.disponivel) {
			this.disponivel = false;
			return "Venda realizada com sucesso";
		}
		return "Venda já foi realizada";
	}
	
	@Override
	public String toString() {	
		// TODO Auto-generated method stub
		String informacoes_venda = "";
		
		informacoes_venda += "[Titulo: " + getTitulo() + "]\n";
		informacoes_venda += "[Horario: " + getHorario() + "]\n";
		informacoes_venda += "[Sala: " + getSala() + "]\n";
		informacoes_venda += "[Poltrona: " + getPoltrona() + "]\n";
		informacoes_venda += "[Volor Total: " + getvalorOriginal() + "]";
		
		return informacoes_venda;
	}
}
