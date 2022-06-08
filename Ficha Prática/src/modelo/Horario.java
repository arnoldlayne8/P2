package modelo;

public class Horario {
    //Atributos
    private DiaSemana diaSemana;
    private int horaInicio;
    private int duracao;

    //Contrutores
    public Horario(DiaSemana diaSemana, int horaInicio, int duracao) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }

    //Getters e Setters
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public int getHoraFim(){
        return horaInicio + duracao;
    }
    public int getDuracao() {
        return duracao;
    }

    //Métodos Instância

}
