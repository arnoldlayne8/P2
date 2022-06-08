package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Barco extends Veiculo implements VeiculoCarregavel {
    Integer anoContrucao;
    GestorVeiculosCarregaveis gestorVeiculosCarregaveis;

    public Barco(Integer maxPassageiros, Integer anoContrucao) {
        super(maxPassageiros);
        this.anoContrucao = anoContrucao;
        gestorVeiculosCarregaveis = new GestorVeiculosCarregaveis();
    }

    public Integer getAnoContrucao() {
        return anoContrucao;
    }

    @Override
    public long getPesoCargaTn() {
        return gestorVeiculosCarregaveis.getPesoCargaTn();
    }

    @Override
    public void adicionarCarga(Integer pesoCargaAdicionarTn) {
        gestorVeiculosCarregaveis.adicionarCarga(pesoCargaAdicionarTn);
    }

    @Override
    public void removerCarga(Integer pesoCargaRemoverTn) {
        gestorVeiculosCarregaveis.removerCarga(pesoCargaRemoverTn);
    }
}