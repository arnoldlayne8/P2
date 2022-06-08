package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public abstract class Veiculo {
    Integer numPassageiros;
    Integer maxPassageiros;

    public Veiculo(Integer maxPassageiros) {
        this.numPassageiros = 0;
        this.maxPassageiros = maxPassageiros;
    }

    public Integer getNumPassageiros() {
        return numPassageiros;
    }
    public Integer getMaxPassageiros() {
        return maxPassageiros;
    }

    public void adicionarPassageiros(Integer numPassageirosAdicionar){
        if (numPassageirosAdicionar > (maxPassageiros - numPassageiros)){
            return;
        }
        numPassageiros += numPassageirosAdicionar;
    }
    public void removerPassageiros(Integer numPassageirosRemover){
        if (numPassageirosRemover > numPassageiros){
            return;
        }
        numPassageiros -= numPassageirosRemover;
    }
}
