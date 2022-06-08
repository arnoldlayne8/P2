package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa implements Funcionario<GabineteSeguranca, Divisao> {
    GestorFuncionarios<GabineteSeguranca, Divisao> gestorFuncionarios;
    public Seguranca(String nome, int numero, GabineteSeguranca gabineteSeguranca) {
        super(nome, numero);
        gestorFuncionarios = new GestorFuncionarios<>(this);
    }

    //Interface Funcionário
    @Override
    public LinkedList<Horario> getHorariosAtendimento() {
        return gestorFuncionarios.getHorariosAtendimento();
    }

    @Override
    public void adicionar(Horario horarioAtendiemento){
        gestorFuncionarios.adicionar(horarioAtendiemento);
    }

    @Override
    public void remover(Horario horarioAtendimento){
        gestorFuncionarios.remover(horarioAtendimento);
    }

    @Override
    public GabineteSeguranca getGabinete() {
        return gestorFuncionarios.getGabinete();
    }

    @Override
    public void atribuirGabinete(GabineteSeguranca gabinete) {
        gestorFuncionarios.atribuir(gabinete);
    }

    @Override
    public void desassociarGabinete() {
        gestorFuncionarios.desassociarGabinete();
    }

    @Override
    public void abrirGabinete() {
        gestorFuncionarios.abrirGabinete();
    }

    @Override
    public void fecharGabinete() {
        gestorFuncionarios.fecharGabinete();
    }

    @Override
    public void abrir(Divisao divisao) {
        gestorFuncionarios.abrir(divisao);
    }

    @Override
    public void fechar(Divisao divisao) {
       gestorFuncionarios.fechar(divisao);
    }

    //Métodos Estáticos

}
