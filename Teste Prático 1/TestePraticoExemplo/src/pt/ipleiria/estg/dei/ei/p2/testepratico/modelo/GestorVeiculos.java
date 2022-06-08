package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

import java.util.LinkedList;

public enum GestorVeiculos {
    INSTANCIA;

    private LinkedList<Reboque> reboques;
    private LinkedList<Automovel> automoveis;
    private LinkedList<Barco> barcos;

    GestorVeiculos() {
        reboques = new LinkedList<>();
        automoveis = new LinkedList<>();
        barcos = new LinkedList<>();

        // TODO: Adicionar veículos
        Automovel automovel1 = new Automovel (5, "12-12-AB");
        automovel1.adicionarPassageiros(3);
        automovel1.adicionarCarga(5);

        Automovel automovel2 = new Automovel (5, "AD-AC-41");
        automovel2.adicionarPassageiros(5);
        automovel2.adicionarCarga(10);

        automoveis.add(automovel1);
        automoveis.add(automovel2);

        Barco barco1 = new Barco(5, 2020);
        barco1.adicionarCarga(1);
        barco1.adicionarPassageiros(3);

        Barco barco2 = new Barco(5, 2018);
        barco1.adicionarCarga(2);
        barco1.adicionarPassageiros(5);

        barcos.add(barco1);
        barcos.add(barco2);

        ReboqueVeiculoTerrestre reboque1 = new ReboqueVeiculoTerrestre("10-10-12");
        reboque1.associar(automovel1);

        ReboqueBarco reboque2 = new ReboqueBarco("10-10-12");
        reboque2.associar(barco1);

        reboques.add(reboque1);
        reboques.add(reboque2);
    }

    public LinkedList<Reboque> getReboques() {
        return new LinkedList<>(reboques);
    }

    public LinkedList<Automovel> getAutomoveis() {
        return new LinkedList<>(automoveis);
    }

    public LinkedList<Barco> getBarcos() {
        return new LinkedList<>(barcos);
    }
}
