public class Estacionamento {
    private int capacidade;
    private String local;
    private int vagasOcupadas;

    public Estacionamento(int capacidade, String local) {
        this.capacidade = capacidade;
        this.local = local;
        this.vagasOcupadas = 0;
    }

    public void CalculoContratante(int vagasContratadas) {
        if (vagasContratadas > capacidade) {
            System.out.println("Não é possível contratar mais vagas do que a capacidade total do estacionamento.");
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
