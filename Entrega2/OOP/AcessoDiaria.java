package OOP;

public class AcessoDiaria extends Acesso {

  public AcessoDiaria(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida, Valores valor
  /*tinha um espaço vazio aqui eu tirei n sei se ta certo veja ai e me diz depois */ ){
    super(placa, entrada, saida, dataEntrada, dataSaida, valor);
  }

  @Override
  public float calcularValor(Valores valor, Horario entrada, Horario saida) {
    if (entrada.getHora()>=19 && saida.getHora()<=8) {
    	return valor.getValorNoturno();
    }
    else {
      return valor.getValorDiaria();
    }
  }
}
