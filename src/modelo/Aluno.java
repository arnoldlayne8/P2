package modelo;

import java.util.LinkedList;

public class Aluno extends Pessoa {
    //Atributos

    //Contrutores
    public Aluno(String nome, Integer numero) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
    }

    //Getters e Setters


    //Métodos Instância
    public void preencherSumario (Aula aula){
        if (aula == null)
            return;
        assinarSumario(aula);
    }

    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
        aula.adicionar(this);
    }
    public void remover(Aula aula){
        super.remover(aula);
        aula.remover(this);
    }

    //Métodos Estáticos
}
