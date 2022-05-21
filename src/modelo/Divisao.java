package modelo;

import java.util.LinkedList;

public abstract class Divisao extends Descritor {
    private boolean aberta;

    public Divisao(String nome, boolean aberta) {
        super(nome);
        this.aberta = aberta;
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
