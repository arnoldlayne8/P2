package modelo;

import java.util.LinkedList;

public class Professor extends PessoaComAulas implements Funcionario<GabineteProfessor, Sala>{
    private GestorFuncionarios<GabineteProfessor, Sala> gestorFuncionarios;

    //Contrutores
    public Professor(String nome, int numero, GabineteProfessor gabineteProfessor) {
        super(nome, numero);
        gestorFuncionarios = new GestorFuncionarios<>(this);
    }

    public void preencherSumario(Aula aula){
        aula.adicionarLinhaSumario(aula.getNome());

        assinarSumario(aula);

        for (Aluno aluno:
                aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
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
    public GabineteProfessor getGabinete() {
        return gestorFuncionarios.getGabinete();
    }
    @Override
    public void abrirGabinete(){
        gestorFuncionarios.abrirGabinete();
    }
    @Override
    public void fecharGabinete(){
        gestorFuncionarios.fecharGabinete();
    }
    @Override
    public void abrir(Sala sala){
        gestorFuncionarios.abrir(sala);
    }
    @Override
    public void fechar(Sala sala){
        gestorFuncionarios.fechar(sala);
    }
    @Override
    public void atribuirGabinete(GabineteProfessor gabineteProfessor){
        gestorFuncionarios.atribuir(gabineteProfessor);
    }
    @Override
    public void desassociarGabinete() {
        gestorFuncionarios.desassociarGabinete();
    }

    //Associável Aulas
    @Override
    public void associar(Aula aula) {
        aula.setProfessor(this);
    }
    @Override
    public void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }
}
