package modelo;

import java.util.LinkedList;

public class Aluno extends PessoaComAulas {
    public Aluno(String nome, Integer numero) {
        super(nome, numero);
    }
    public void preencherSumario (Aula aula){
        if (aula == null)
            return;
        assinarSumario(aula);
    }
    public void escreverSumario(){

    }
    @Override
    public void associar(Aula aula) {
        aula.adicionar(this);
    }
    @Override
    public void desassociar(Aula aula) {
        aula.remover(this);
    }
}
