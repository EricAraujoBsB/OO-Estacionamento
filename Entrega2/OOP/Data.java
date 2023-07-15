package OOP;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data() {}

    public Data(int ano, int mes, int dia) {

       if (ano < 1950) {
            throw new RuntimeException("\nCampo ano inválido!\n");
      } else {
            this.ano = ano;
      }
      if (mes < 1 || mes > 12) {
            throw new RuntimeException("\nCampo mês inválido!\n");
       } else {
            this.mes = mes;
       }
       if (dia < 1 || dia > 31) {
            throw new RuntimeException("\nCampo dia inválido!\n");
       } else {
            this.dia = dia;
      }
   }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
 }
