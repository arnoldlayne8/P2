package modelo;

import java.util.LinkedList;

public interface Funcionario<TGabinete extends Gabinete, TDivisao extends Divisao> {
    LinkedList<Horario> getHorariosAtendimento();
    void adicionar(Horario horario);
    void remover(Horario horario);

    void desassociarGabinete();
    void abrirGabinete();
    void fecharGabinete();

    void atribuirGabinete(TGabinete gabinete);
    TGabinete getGabinete();


    void abrir(TDivisao divisao);
    void fechar(TDivisao divisao);

}
