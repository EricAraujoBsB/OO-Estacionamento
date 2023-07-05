
public class Valores {
	private int valorFracao,
				valorCheio,
				valorDiaria,
				valorNoturno,
				valorMensal,
				valorEvento;
	private Valores() {}
	public Valores(int v1, int v2, int v3, int v4, int v5, int v6) {
		this.valorFracao = v1;
		this.valorCheio = v2;
		this.valorDiaria = v3;
		this.valorNoturno = v4;
		this.valorMensal = v5;
		this.valorEvento = v6;
	}
	
	public int getValorFracao() {
		return valorFracao;
	}
	public void setValorFracao(int v) {
		this.valorFracao = v;
	}
	
	public int getValorCheio() {
		return valorCheio;
	}
	public void setValorCheio(int v) {
		this.valorCheio = v;
	}
	
	public int getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(int v) {
		this.valorDiaria = v;
	}
	
	public int getValorNoturno() { 
		return valorNoturno;
	}
	public void setValorNoturno(int v) {
		this.valorNoturno = v;
	}
	
	public int getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(int v) {
		this.valorMensal = v;
	}
	
	public int getValorEvento() {
		return valorEvento;
	}
	public void setValorEvento(int v) {
		this.valorEvento = v;
	}
	
	
}
