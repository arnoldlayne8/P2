package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

import java.util.LinkedList;

public abstract class PiscinaAnimais<TAnimal extends Animal> extends Piscina{
    protected long tratamento;

    public PiscinaAnimais(long capacidadeMaximaAguaLt) {
        super(capacidadeMaximaAguaLt);
    }

    protected void adicionarTratamento(long tratamentoLt){
     if (tratamentoLt == 0)
         return;
    }
}
