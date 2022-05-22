package modelo;

import java.util.LinkedList;

public class Aluno extends PessoaComAulas {
    //Atributos

    //Contrutores
    public Aluno(String nome, Integer numero) {
        super(nome, numero);
    }

    //Métodos Instância
    @Override
    public void escreverSumario(Aula aula) {
        assinarSumario(aula);
    }

    @Override
    public void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.remover(this);
    }

    //Métodos Estáticos
}
