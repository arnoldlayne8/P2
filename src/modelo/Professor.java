package modelo;

import java.util.LinkedList;

public class Professor {
    //Atributos
    private String nome;
    private int numero;
    LinkedList<Aula> aulas;

    //Contrutores
    public Professor(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }

    //Métodos Instância
    public void preencherSumario(Aula aula){

    }
    private void assinarSumario(Aula aula){

    }
    public void adicionar(Aula aula){
        if (aula == null)
            return;
        if (aulas.contains(aula))
            return;
        aulas.add(aula);
    }
    public void remover(Aula aula){
        if (aula == null)
            return;
        if (!aulas.contains(aula))
            return;
        aulas.remove(aula);
    }
    //Métodos Estáticos

}
