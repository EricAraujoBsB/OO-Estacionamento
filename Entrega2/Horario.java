package OOP;

public class Horario {
  private int hora;
  private int minutos;

  public Horario(){}

  public Horario(int hora, int minutos){
    if( hora > 23 || hora < 0 && minutos > 60 || minutos < 0){
      throw new RuntimeException("\nO Horário inserido é invalido\n");}
    }else {
    this.hora = hora;
    this.minutos = minutos
  }
  
  public int getHora(){
    return hora;
  }
  public void setHora(int hora){
    this.hora = hora;
  }
  public int getMinutos(){
    return minutos;
  }
  public void setMinutos(int minutos){
   this.minutos = minutos;
  }

  }
