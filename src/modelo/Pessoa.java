package modelo;

import java.util.LinkedList;

public abstract class Pessoa extends Identificador {
    //Atributos
    LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
    }

    //Getters e Setters
    public LinkedList<Aula> getAulas(){
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

    //Métodos Instância
    public void preencherSumario(Aula aula){
        if (aula == null || !aulas.contains(aula))
            return;
    }

    protected void assinarSumario(Aula aula){
        if (aula == null)
            return;
        aula.adicionarLinhaSumario(String.valueOf(getNumero()));
        aula.adicionarLinhaSumario(nome);
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
}
