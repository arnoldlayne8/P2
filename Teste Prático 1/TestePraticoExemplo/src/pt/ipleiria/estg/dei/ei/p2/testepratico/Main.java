package pt.ipleiria.estg.dei.ei.p2.testepratico;

import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Automovel;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Barco;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.GestorVeiculos;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Reboque;

public class Main {
    public Main() {
        for (Automovel automovel : GestorVeiculos.INSTANCIA.getAutomoveis()) {
            System.out.println(automovel);
        }
        for (Barco barco : GestorVeiculos.INSTANCIA.getBarcos()) {
            System.out.println(barco);
        }
        for (Reboque reboque : GestorVeiculos.INSTANCIA.getReboques()) {
            System.out.println(reboque);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
