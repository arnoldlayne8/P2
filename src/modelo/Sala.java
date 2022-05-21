package modelo;

import java.util.LinkedList;

public class Sala extends Descritor {
    private String nome;
    private LinkedList<Aula> aulas;
    private boolean aberta;

    public Sala(String nome, boolean aberta) {
        super(nome);
        this.aberta = aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAulas(LinkedList<Aula> aulas) {
        this.aulas = aulas;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}
