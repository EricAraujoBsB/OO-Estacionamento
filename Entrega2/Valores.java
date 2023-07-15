package OOP;
public class Valores {
	private float valorFracao,
				valorCheio,
				valorDiaria,
				valorNoturno,
				valorMensal,
				valorEvento,
				valorEntrada;

	private Valores() {}
	public Valores(float v1, float v2, float v3, float v4, float v5, float v6 , float v7) {
		this.valorFracao = v1;
		this.valorCheio = v2;
		this.valorDiaria = v3;
		this.valorNoturno = v4;
		this.valorMensal = v5;
		this.valorEvento = v6;
		this.valorEntrada = v7;
		//do que se trata o valorEntrada @EricAraujoBsB
	}
	
	public float getValorFracao() {
		return valorFracao;
	}
	public void setValorFracao(float v) {
		this.valorFracao = v;
	}
	
	public float getValorCheio() {
		return valorCheio;
	}
	public void setValorCheio(float v) {
		this.valorCheio = v;
	}
	
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float v) {
		this.valorDiaria = v;
	}
	
	public float getValorNoturno() { 
		return valorNoturno;
	}
	public void setValorNoturno(float v) {
		this.valorNoturno = v;
	}
	
	public float getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(float v) {
		this.valorMensal = v;
	}
	
	public float getValorEvento() {
		return valorEvento;
	}
	public void setValorEvento(float v) {
		this.valorEvento = v;
	}

	public float getEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(float v) {
		this.valorEvento = v;
	}
	
	
}
