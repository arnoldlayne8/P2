package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public interface VeiculoCarregavel {
    long getPesoCargaTn();
    void adicionarCarga(Integer pesoCargaAdicionarTn);
    void removerCarga(Integer pesoCargaRemoverTn);
}
