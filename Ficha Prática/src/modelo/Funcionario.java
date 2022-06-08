package modelo;

import java.util.LinkedList;

public interface Funcionario<TGabinete extends Gabinete, TDivisao extends Divisao> {

    LinkedList<Horario> getHorariosAtendimento();
    void adicionar(Horario horario);
    void remover(Horario horario);
    TGabinete getGabinete();
    void atribuirGabinete(TGabinete gabinete);
    void desassociarGabinete();
    void abrirGabinete();
    void fecharGabinete();

    void abrir(TDivisao divisao);
    void fechar(TDivisao divisao);
}
