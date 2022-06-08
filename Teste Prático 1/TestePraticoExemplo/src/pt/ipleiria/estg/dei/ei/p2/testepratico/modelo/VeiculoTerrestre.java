package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public abstract class VeiculoTerrestre extends Veiculo{
    String matricula;

    public VeiculoTerrestre(Integer maxPassageiros, String matricula) {
        super(maxPassageiros);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
