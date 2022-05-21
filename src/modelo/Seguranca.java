package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa {

    private GabineteSeguranca gabineteSeguranca;
    private LinkedList<Horario> horariosAtendimento;

    //Contrutores
    public Seguranca(String nome, int numero, GabineteSeguranca gabineteSeguranca) {
        super(nome, numero);
        this.gabineteSeguranca = gabineteSeguranca;
        this.horariosAtendimento = new LinkedList<>();
    }

    //Getters e Setters


    public GabineteSeguranca getGabineteSeguranca() {
        return gabineteSeguranca;
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

    public void abrirGabinete(GabineteSeguranca gabineteSeguranca){
        this.gabineteSeguranca.setAberta(true);
    }

    public void fecharGabinete(GabineteSeguranca gabineteSeguranca){
        this.gabineteSeguranca.setAberta(false);
    }

    public void abrir(Sala sala){
        sala.setAberta(true);
    }

    public void fechar(Sala sala){
        sala.setAberta(false);
    }

    public void atribuir(GabineteSeguranca gabineteSeguranca){
        if (gabineteSeguranca == null || gabineteSeguranca == this.gabineteSeguranca)
            return;
        this.gabineteSeguranca = gabineteSeguranca;
    }

    public void desassociar(GabineteSeguranca gabineteSeguranca){
        if (this.gabineteSeguranca == null)
            return;
        this.gabineteSeguranca = null;
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
