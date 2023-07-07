package OOP;

public class Estacionamento {
    private int capacidade;
    private String local;
    private int vagasOcupadas;
    private Valores valor

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
            System.out.println("Não é possível contratar mais vagas.");
        } else {
            vagasOcupadas += vagasContratadas;
            System.out.println("Vagas contratadas com sucesso. Vagas ocupadas: " + vagasOcupadas);
        }
    }

    public void verificaLotacao() {
        int vagasDisponiveis = capacidade - vagasOcupadas;
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }
}
