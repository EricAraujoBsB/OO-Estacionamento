package OOP;
public class Valores {
	private float valorFracao,
				valorCheio,
				valorDiaria,
				valorNoturno,
				valorMensal,
				valorEvento;
	private Valores() {}
	public Valores(float v1, float v2, float v3, float v4, float v5, float v6) {
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
	public void setValorFracao(float v) {
		this.valorFracao = v;
	}
	
	public int getValorCheio() {
		return valorCheio;
	}
	public void setValorCheio(float v) {
		this.valorCheio = v;
	}
	
	public int getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float v) {
		this.valorDiaria = v;
	}
	
	public int getValorNoturno() { 
		return valorNoturno;
	}
	public void setValorNoturno(float v) {
		this.valorNoturno = v;
	}
	
	public int getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(float v) {
		this.valorMensal = v;
	}
	
	public int getValorEvento() {
		return valorEvento;
	}
	public void setValorEvento(float v) {
		this.valorEvento = v;
	}
	
	
}
