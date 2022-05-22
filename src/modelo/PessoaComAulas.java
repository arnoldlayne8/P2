package modelo;

import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa
    implements AssociavelAulas, RepositorioAulas{

    protected GestorAulas gestorAulas;

    public PessoaComAulas(String nome, long numero) {
        super(nome, numero);
        this.gestorAulas = new GestorAulas(this);
    }

    public LinkedList<Aula> getAulas(){
        return gestorAulas.getAulas();
    }

    public LinkedList<Aula> getAulas(Horario horario){
        return gestorAulas.getAulas(horario);
    }

    public void adicionar(Aula aula){
        gestorAulas.adicionar(aula);
    }

    public void remover(Aula aula){
        gestorAulas.remover(aula);
    }


    /*
    Os métodos associar() e desassociar() são implementados mas classes concretas:
    Aluno, Professor e Sala

    @Override
    public void associar(Aula aula) {}

    @Override
    public void desassociar(Aula aula) {}

    */

    @Override
    public boolean contem(Aula aula) {
        return gestorAulas.contem(aula);
    }

    //Métodos Instância
    public void preencherSumario(Aula aula){
        if (aula == null || !this.contem(aula))
            return;
        escreverSumario(aula);
    }

    public abstract void escreverSumario(Aula aula);

    protected void assinarSumario(Aula aula){
        if (aula == null)
            return;
        aula.adicionarLinhaSumario(getNome());
    }
}
