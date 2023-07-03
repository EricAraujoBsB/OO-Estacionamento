package OOP;

public class Acesso {
  private String placa;
  private Horario entrada;
  private Horario saida;


  public Acesso(){}

  public Acesso(String placa, Horario entrada, Horario saida){
    this.placa = placa;
    this.entrada = entrada;
    this.saida = saida;
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
}
