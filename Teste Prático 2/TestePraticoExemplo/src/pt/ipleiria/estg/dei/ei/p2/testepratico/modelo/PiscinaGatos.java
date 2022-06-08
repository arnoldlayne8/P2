package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class PiscinaGatos extends PiscinaAnimais<Gato> implements Temperatura {
    GestorTemperatura gestorTemperatura;

    public PiscinaGatos(long capacidadeMaximaAguaLt, long temperatura) {
        super(capacidadeMaximaAguaLt);
        gestorTemperatura = gestorTemperatura;
        gestorTemperatura.setTemperatura(temperatura);
    }

    @Override
    public long getTemperatura() {
        return gestorTemperatura.getTemperatura();
    }
    @Override
    public void setTemperatura(long temperatura) {
        gestorTemperatura.setTemperatura(temperatura);
    }
}
