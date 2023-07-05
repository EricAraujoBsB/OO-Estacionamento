package OOP;

public class AcessoMensalista extends Acesso {

  public AcessoDiaria(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida, Valores valor,  ){
    super(placa, entrada, saida, dataEntrada, dataSaida, valor);
  }

  @Override
  public float calcularValor(Valores valor, Horario entrada, Horario saida) {
    // Logica do valor do usuário mensal
    return valor.getValorMensal();
  }
}
