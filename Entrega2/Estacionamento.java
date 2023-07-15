package OOP;

import javax.swing.*;
import java.util.ArrayList;

public class Estacionamento {
    private int capacidade;
    private String local;
    private int vagasOcupadas;
    private Valores valor;
    private Horario abrir;
    private Horario fechar;
    ArrayList<Acesso> acessos = new ArrayList<>();
    ArrayList<Evento> eventos = new ArrayList<>();


    public Estacionamento(int capacidade, String local, Horario abrir, Horario fechar) {
        this.capacidade = capacidade;
        this.local = local;
        this.abrir = abrir;
        this.fechar = fechar;
    }
    public void cadastrarValoresEstacionamento(float valorFracao,float valorCheio,  float valorDiaria, float valorNoturno, float valorMensal, float valorEvento){
        //construtor de valores requisita um valor de entrada @EricAraujoBsB
    	valor = new Valores(valorFracao, valorCheio, valorDiaria, valorNoturno, valorMensal, valorEvento);
    }
    public void cadastrarEventos(String nome, Data dataInicio, Data dataFinal, Horario inicio, Horario fim){
        eventos.add( new Evento(nome, dataInicio, dataFinal, inicio, fim));
    } 

    public void CalculoContratante(int vagasContratadas) {
        if (vagasContratadas > capacidade) {
                    String str1 = (String) JOptionPane.showInputDialog("Não é possível contratar mais vagas.");
        } else {
            vagasOcupadas += vagasContratadas;
                        String str2 = (String) JOptionPane.showInputDialog("Vagas contratadas com sucesso. Vagas ocupadas: " + vagasOcupadas);
        }
    }

    public void verificaLotacao() {
        int vagasDisponiveis = capacidade - vagasOcupadas;
                    String str3 = (String) JOptionPane.showInputDialog("Vagas disponíveis: " + vagasDisponiveis);
    }

    public void CadastrarAcesso(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida) {
        int Hora = 18; 
        int Minuto = 0;
    
        if ((entrada.getHora() > Hora) || (entrada.getHora() == Hora && entrada.getMinutos() > Minuto)
        || (saida.getHora() > Hora) || (saida.getHora() == Hora && saida.getMinutos() > Minuto)) {
                        String str4 = (String) JOptionPane.showInputDialog("Nao e possivel cadastrar o acesso.");
        } else if (dataEntrada.getDia() > 30 || dataSaida.getDia() > 30) {
                       String str5 = (String) JOptionPane.showInputDialog("Nao e possivel cadastrar o acesso.");
        } else {
                       String str6 = (String) JOptionPane.showInputDialog("Acesso cadastrado com sucesso.");
        }
    }
    public boolean acessoEvento(ArrayList<Evento> eventos, Data dataAcesso){
        for (Evento evento: eventos){
            Data inicioEvento = evento.getDataInicio();
            Data fimEvento = evento.getDataFim();
            if (dataAcesso.getMes() == inicioEvento.getMes() || dataAcesso.getMes() == fimEvento.getMes()){
                if(dataAcesso.getAno() == inicioEvento.getAno() || dataAcesso.getAno() == fimEvento.getAno()){
                    if (inicioEvento.getMes() != fimEvento.getMes()){
                        if(dataAcesso.getDia() >= inicioEvento.getDia() || dataAcesso.getDia() <= fimEvento.getDia()){
                            return true;
                        }
                    else if(inicioEvento.getMes() == fimEvento.getMes()){
                        if(dataAcesso.getDia() >= inicioEvento.getDia() && dataAcesso.getDia() <= fimEvento.getDia()){
                            return true;
                        }
                    }
                    }
                }
            }
        }
        return false;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public String getLocal(){
        return local;
    }
// instanciar metodo 'setLocal' @EricAraujoBsB
    public String getVagasOcupadas(){
        //DownCasting int to Str @EricAraujoBsB
    	return vagasOcupadas;
    }
    public Valores getValor(){
        return valor;
    }
    public Horario getAbrir(){
        return abrir;
    }
    public void setAbrir(Horario abrir){
        this.abrir = abrir;
    } 
    public Horario getFechar(){
        return fechar;
    }
    public void setFechar(Horario fechar){
        this.fechar = fechar;
    }
}
