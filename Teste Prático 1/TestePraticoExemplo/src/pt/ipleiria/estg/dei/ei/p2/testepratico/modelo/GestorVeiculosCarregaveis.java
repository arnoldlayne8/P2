package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class GestorVeiculosCarregaveis {
    long pesoCargaTn;

    public GestorVeiculosCarregaveis() {
        this.pesoCargaTn = 0;
    }
    public long getPesoCargaTn() {
        return pesoCargaTn;
    }
    public void adicionarCarga(Integer pesoCargaAdicionarTn){
        this.pesoCargaTn += pesoCargaAdicionarTn;
    }
    public void removerCarga(Integer pesoCargaRemoverTn){
        if (pesoCargaRemoverTn > pesoCargaTn)
            return;
        pesoCargaTn -= pesoCargaRemoverTn;
    }
}
