package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa
    implements Funcionario<GabineteSeguranca, Divisao>{

    private GestorFuncionarios<GabineteSeguranca, Divisao> gestorFuncionario;

    //Contrutores
    public Seguranca(String nome, int numero, GabineteSeguranca gabineteSeguranca) {
        super(nome, numero);
        this.gestorFuncionario = new GestorFuncionarios<>(this);
        atribuirGabinete(gabineteSeguranca);
    }

    // Métodos de Horários
    @Override
    public LinkedList<Horario> getHorariosAtendimento() {
        return gestorFuncionario.getHorariosAtendimento();
    }

    @Override
    public void adicionar(Horario horarioAtendiemento){
        gestorFuncionario.adicionar(horarioAtendiemento);
    }

    @Override
    public void remover(Horario horarioAtendimento){
        gestorFuncionario.remover(horarioAtendimento);
    }

    // Métodos de Gabinete
    @Override
    public GabineteSeguranca getGabinete() {
        return gestorFuncionario.getGabinete();
    }
    @Override
    public void atribuirGabinete(GabineteSeguranca gabineteSeguranca){
        gestorFuncionario.atribuirGabinete(gabineteSeguranca);
    }
    @Override
    public void desassociarGabinete(){
        gestorFuncionario.desassociarGabinete();
    }
    @Override
    public void abrirGabinete(){
        gestorFuncionario.abrirGabinete();
    }
    @Override
    public void fecharGabinete(){
        gestorFuncionario.fecharGabinete();
    }

    // Métodos de Divisão

    @Override
    public void abrir(Divisao divisao) {
        gestorFuncionario.abrir(divisao);
    }

    @Override
    public void fechar(Divisao divisao) {
        gestorFuncionario.fechar(divisao);
    }







    //Métodos Estáticos

}
