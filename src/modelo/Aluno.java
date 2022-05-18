package modelo;

import java.util.LinkedList;

public class Aluno {
    //Atributos
    private String nome;
    private Integer numero;
    private LinkedList<Aula> aulas;

    //Contrutores
    public Aluno(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public Integer getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }

    //Métodos Instância
    public void preencherSumario (Aula aula){
        if (aula == null)
            return;
        assinarSumario(aula);
    }
    private void assinarSumario(Aula aula){
        if (aula == null)
            return;
        aula.adicionarLinhaSumario(nome + "," + numero);
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
    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }
    public LinkedList<Aula> getAulas(Horario horario){
        LinkedList<Aula> aulasSobreHorario = new LinkedList<>();
        for (Aula aula : aulas){
            if (aula.isSobre(horario)){
                aulasSobreHorario.add(aula);
            }
        }
        return aulasSobreHorario;
    }

    //Métodos Estáticos
}
