package OOP;
public class Evento {
    private String nomeEvento;
    private Data dataInicio;
    private Data dataFim;
    private Horario horaInicio;
    private Horario horaFim;

    private Evento() {}

    public Evento(String nomeEvento, Data dataInicio, Data dataFim, Horario horaInicio, Horario horaFim) {
        this.nomeEvento = nomeEvento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public Horario getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Horario horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Horario getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Horario horaFim) {
        this.horaFim = horaFim;
    }   
}
