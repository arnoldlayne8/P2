package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public abstract class Reboque<TVeiculoRebocavel extends Veiculo> extends VeiculoTerrestre {
    public static Integer MAXIMO_PASSAGEIROS = 2;
    protected TVeiculoRebocavel veiculoRebocado;
    public Reboque(String matricula) {
        super(MAXIMO_PASSAGEIROS, matricula);
    }
    public TVeiculoRebocavel getVeiculoRebocado() {
        return veiculoRebocado;
    }
    public void associar(TVeiculoRebocavel veiculoRebocar){
        if (veiculoRebocar == null)
            return;

        this.veiculoRebocado = veiculoRebocar;
    }
    public void desassociarVeiculo() {
        if (this.veiculoRebocado == null)
            return;
        this.veiculoRebocado = null;
    }
}
