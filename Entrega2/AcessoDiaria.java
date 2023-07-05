package OOP;

public class AcessoDiaria extends Acesso {

  public AcessoDiaria(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida, Valores valor,  ){
    super(placa, entrada, saida, dataEntrada, dataSaida, valor);
  }

  @Override
  public float calcularValor(Valores valor, Horario entrada, Horario saida) {
    if((getEntrada().getHora() >= fechar.getHora() && getEntrada().getMinuto() >= fechar.getMinuto())
        && (getSaida().getHora() <= abrir.getHora() && getSaida().getMinuto() <= abrir.getMinuto())) {
      return valor.getValorNoturno();
    }else {
      return valor.getValorDiaria();
    }
  }
}
