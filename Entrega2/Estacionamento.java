


package OOP;

public class Estacionamento {
    private int capacidade;
    private String local;
    private int vagasOcupadas;
    private Valores valor;

    public Estacionamento(int capacidade, String local) {
        this.capacidade = capacidade;
        this.local = local;
        this.vagasOcupadas = 0;
    }
    public void cadastrarValoresEstacionamento(float valorFracao, float valorDiaria, float valorNoturno, float valorMensal, float valorEvento){
        valor = new Valores(valorFracao, valorDiaria, valorNoturno, valorMensal, valorEvento);
    }
    public void cadastrarEventos(String nome, Data dataInicio, Data dataFinal, Horario inicio, Horario fim){
        evento = new Evento(nome, dataInicio, dataFinal, inicio, fim);
    } 

    public void CalculoContratante(int vagasContratadas) {
        if (vagasContratadas > capacidade) {
                    string str1 = (string) joptionpane.showinputdialog("Não é possível contratar mais vagas.");
        } else {
            vagasOcupadas += vagasContratadas;
                        string str2 = (string) joptionpane.showinputdialog("Vagas contratadas com sucesso. Vagas ocupadas: " + vagasOcupadas);
        }
    }

    public void verificaLotacao() {
        int vagasDisponiveis = capacidade - vagasOcupadas;
                    string str3 = (string) joptionpane.showinputdialog("Vagas disponíveis: " + vagasDisponiveis);
    }

    public void CadastrarAcesso(String placa, Horario entrada, Horario saida, Data dataEntrada, Data dataSaida) {
        int Hora = 18; 
        int Minuto = 0;
    
        if ((entrada.getHora() > Hora) || (entrada.getHora() == Hora && entrada.getMinuto() > Minuto)
        || (saida.getHora() > Hora) || (saida.getHora() == Hora && saida.getMinuto() > Minuto)) {
                        string str4 = (string) joptionpane.showinputdialog("Nao e possivel cadastrar o acesso.");
        } else if (dataEntrada.getDia() > 30 || dataSaida.getDia() > 30) {
                       string str5 = (string) joptionpane.showinputdialog("Nao e possivel cadastrar o acesso.");
        } else {
                       string str6 = (string) joptionpane.showinputdialog("Acesso cadastrado com sucesso.");
        }
    }
    public String getCapacidade(){
        return capacidade;
    }
    public String getLocal(){
        return local;
    }
    public String getVagasOcupadas(){
        return vagasOcupadas;
    }
    public String getValor(){
        return valor;
    }
}
