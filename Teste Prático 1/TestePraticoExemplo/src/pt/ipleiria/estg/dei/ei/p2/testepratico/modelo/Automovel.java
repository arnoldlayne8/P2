package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Automovel extends VeiculoTerrestre implements VeiculoCarregavel {
    GestorVeiculosCarregaveis gestorVeiculosCarregaveis;
    public Automovel(Integer maxPassageiros, String matricula) {
        super(maxPassageiros, matricula);
        gestorVeiculosCarregaveis = new GestorVeiculosCarregaveis();
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
