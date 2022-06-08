package modelo;

import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa implements RepositorioAulas, AssociavelAulas{
        protected GestorAulas gestorAulas;
    public PessoaComAulas(String nome, long numero) {
        super(nome, numero);
        gestorAulas = new GestorAulas(this);
    }

    protected void assinarSumario(Aula aula){
        if (aula == null)
            return;
        aula.adicionarLinhaSumario(String.valueOf(getNumero()));
        aula.adicionarLinhaSumario(nome);
    }

    @Override
    public LinkedList<Aula> getAulas(){
        return new LinkedList<>(gestorAulas.getAulas());
    }

    @Override
    public LinkedList<Aula> getAulas(Horario horario){
        return gestorAulas.getAulas(horario);
    }
    @Override
    public void adicionar(Aula aula){
        gestorAulas.adicionar(aula);
    }
    @Override
    public void remover(Aula aula){
        gestorAulas.remover(aula);
    }

    @Override
    public boolean contem(Aula aula) {
        return gestorAulas.contem(aula);
    }
}
