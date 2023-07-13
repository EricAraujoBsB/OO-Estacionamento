package OOP;
oi
public class Acesso {
  private String placa;
  private Horario entrada;
  private Horario saida;
  private Data dataEntrada;
  private Data dataSaida;


  public Acesso(){}

  public Acesso(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida, Valores valor){
    this.placa = placa;
    this.entrada = entrada;
    this.saida = saida;
    this.dataEntrada = dataEntrada;
    this.dataSaida = dataSaida;
  }

  public float calcularValor(Valores valor,Horario entrada, Horario saida){
    float permanencia = Horario. permanenciaNoEstacionamento(entrada, saida);
    int minFracaoHora = 15;
    int minHoraCheia = 60;
    if(permanencia < 60 && permanencia < 0 ){
      return (permanencia / minFracaoHora) * valor.getValorFracao();
    }else {
      return (permanencia/ minHoraCheia) * valor.getValorCheio();
    }
  }

  public String getPlaca(){
    return placa;
  }
  public void setPlaca(String placa){
    this.placa = placa 
  }
  public String getHorarioEntrada(){
    return entrada;
  }
  public void setHorarioEntrada(Horario entrada){
    this.entrada = entrada;
  }
  public String getHorarioSaida(){
    return saida;
  }
  public void setHorarioSaida(Horario saida){
    this.saida = saida;
  }
  public Data getDataEntrada(){
    return dataEntrada;
  }
  public void setDataEntrada(Data dataEntrada){
    this.dataEntrada = dataEntrada;
  }
  public Data getDataSaida(){
    return dataSaida;
  }
  public void setDataSaida(Data dataSaida){
    this.dataSaida = dataSaida;
  }
}
