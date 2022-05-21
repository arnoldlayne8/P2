package modelo;

import java.util.LinkedList;

public class GabineteSeguranca {
    private String nome;
    private LinkedList<Seguranca> segurancas;
    private boolean aberta;

    public GabineteSeguranca(String nome, boolean aberta) {
        this.nome = nome;
        this.aberta = aberta;
        this.segurancas = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Seguranca> getSegurancas() {
        return new LinkedList<>(segurancas);
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void adicionar(Seguranca seguranca){
        if(seguranca == null || segurancas.contains(seguranca))
            return;
        this.segurancas.add(seguranca);
    }

    public void remover(Seguranca seguranca){
        if (seguranca == null || !segurancas.contains(seguranca))
            return;
        this.segurancas.remove(seguranca);
    }
}
