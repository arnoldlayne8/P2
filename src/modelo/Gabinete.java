package modelo;

import java.util.LinkedList;

public abstract class Gabinete {
    private String nome;
    private LinkedList<Seguranca> professores;
    private boolean aberta;

    public Gabinete(String nome, boolean aberta) {
        this.nome = nome;
        this.aberta = aberta;
        this.professores = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Seguranca> getProfessores() {
        return new LinkedList<>(professores);
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void adicionar(Seguranca professor){
        if(professor == null || professores.contains(professor))
            return;
        this.professores.add(professor);
    }

    public void remover(Seguranca professor){
        if (professor == null || !professores.contains(professor))
            return;
        this.professores.remove(professor);
    }
}
