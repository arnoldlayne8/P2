package modelo;

import java.util.LinkedList;

public class Professor extends Pessoa{
    private GabineteProfessor gabineteProfessor;
    private LinkedList<Horario> horariosAtendimento;

    //Contrutores
    public Professor(String nome, int numero, GabineteProfessor gabineteProfessor) {
        super(nome, numero);
        this.gabineteProfessor = gabineteProfessor;
        this.horariosAtendimento = new LinkedList<>();
    }

    //Getters e Setters


    public GabineteProfessor getGabineteProfessor() {
        return gabineteProfessor;
    }

    public LinkedList<Horario> getHorariosAtendimento() {
        return new LinkedList<>(horariosAtendimento);
    }

    //Métodos Instância
    @Override
    public void preencherSumario(Aula aula){
        aula.adicionarLinhaSumario(aula.getNome());

        assinarSumario(aula);

        for (Aluno aluno:
                aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
        aula.setProfessor(this);
    }

    @Override
    public void remover(Aula aula){
        super.remover(aula);
        aula.desassociarProfessor();
    }

    public void abrirGabinete(){
        this.gabineteProfessor.setAberta(true);
    }

    public void fecharGabinete(){
        this.gabineteProfessor.setAberta(false);
    }

    public void abrir(Sala sala){
        sala.setAberta(true);
    }

    public void fechar(Sala sala){
        sala.setAberta(false);
    }

    public void atribuir(GabineteProfessor gabineteProfessor){
        if (gabineteProfessor == null || gabineteProfessor == this.gabineteProfessor)
            return;
        this.gabineteProfessor = gabineteProfessor;
    }

    public void desassociar(GabineteProfessor gabineteProfessor){
        if (this.gabineteProfessor == null)
            return;
        this.gabineteProfessor = null;
    }

    public void adicionar(Horario horarioAtendiemento){
        if(horarioAtendiemento == null || horariosAtendimento.contains(horarioAtendiemento))
            return;
        this.horariosAtendimento.add(horarioAtendiemento);
    }

    public void remover(Horario horarioAtendimento){
        if (horarioAtendimento == null || !horariosAtendimento.contains(horarioAtendimento))
            return;
        this.horariosAtendimento.remove(horarioAtendimento);
    }

    //Métodos Estáticos

}
