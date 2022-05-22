package modelo;

import java.util.LinkedList;

public class Professor extends PessoaComAulas
    implements Funcionario<GabineteProfessor, Sala>{

    private GestorFuncionarios<GabineteProfessor, Sala> gestorFuncionario;

    //Contrutores
    public Professor(String nome, int numero, GabineteProfessor gabinete) {
        super(nome, numero);
        this.gestorFuncionario = new GestorFuncionarios<>(this);
        atribuirGabinete(gabinete);
    }



    //Métodos de Horário
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


    //Métodos de Gabinete
    @Override
    public GabineteProfessor getGabinete() {
        return gestorFuncionario.getGabinete();
    }
    @Override
    public void atribuirGabinete(GabineteProfessor gabineteProfessor){
        gestorFuncionario.atribuirGabinete(gabineteProfessor);
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


    //Métodos de Sala
    @Override
    public void abrir(Sala sala){
        gestorFuncionario.abrir(sala);
    }
    @Override
    public void fechar(Sala sala){
        gestorFuncionario.fechar(sala);
    }

    //Métodos de Aula
    public void escreverSumario(Aula aula){
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        assinarSumario(aula);

        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    @Override
    public void associar(Aula aula) {
        aula.setProfessor(this);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    //Métodos Estáticos

}
