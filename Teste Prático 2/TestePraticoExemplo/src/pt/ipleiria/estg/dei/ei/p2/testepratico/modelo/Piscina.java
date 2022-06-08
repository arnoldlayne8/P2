package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

import java.util.LinkedList;

public abstract class Piscina<TUtente extends Utente> {
    protected long capacidadeMaximaAguaLt;
    protected long quantidadeAtualAguaLt;
    private LinkedList<Pessoa> pessoas;

    public Piscina(long capacidadeMaximaAguaLt) {
        this.capacidadeMaximaAguaLt = capacidadeMaximaAguaLt;
        this.quantidadeAtualAguaLt = 0;
        pessoas = new LinkedList<>();
    }

    public long getCapacidadeMaximaAguaLt() {
        return capacidadeMaximaAguaLt;
    }
    public long getQuantidadeAtualAguaLt() {
        return quantidadeAtualAguaLt;
    }

    public void encher(){
        if (quantidadeAtualAguaLt == capacidadeMaximaAguaLt)
            return;
        quantidadeAtualAguaLt = capacidadeMaximaAguaLt;
    }
    public void esvaziar(){
        if (quantidadeAtualAguaLt == 0)
            return;
        quantidadeAtualAguaLt = 0;
    }
    public void adicionar(long quantidadeAguaAdicionarLt){
        if (quantidadeAguaAdicionarLt == 0)
            return;

        if (quantidadeAguaAdicionarLt > (capacidadeMaximaAguaLt - quantidadeAtualAguaLt))
            return;

        quantidadeAtualAguaLt += quantidadeAguaAdicionarLt;
    }
    public void remover(long quantidadeAguaRemoverLt){
        if (quantidadeAguaRemoverLt == 0)
            return;

        if (quantidadeAguaRemoverLt < quantidadeAtualAguaLt)
            return;

        quantidadeAtualAguaLt -= quantidadeAguaRemoverLt;
    }
}
