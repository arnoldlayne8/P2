package modelo;

import java.util.LinkedList;

public class Aula {
    //Atributos
    private String nome;
    private Integer numero;
    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;

    //Contrutores
    public Aula(String nome, Integer numero, Horario horario) {
        this(nome, numero,null, null, new LinkedList<>());
    }
    public Aula(String nome, Integer numero, Horario horario, Professor professor, LinkedList<Aluno> alunos){
        this.nome = nome;
        this.numero = numero;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public StringBuilder getSumario() {
        return sumario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }
    public Horario getHorario() {
        return horario;
    }

    //Métodos Instância
    public void adicionar(Aluno aluno){
        if (aluno == null)
            return;

        if (alunos.contains(aluno))
            return;

        alunos.add(aluno);
    }
    public void remover(Aluno aluno){
        if (aluno == null)
            return;

        if (!alunos.contains(aluno))
            return;

        alunos.remove(aluno);
    }
    public void setProfessor(Professor professor){
        if (professor == null)
            return;

        if (this.professor == professor )
            return;

        this.professor = professor;
    }
    public void desassociarProfessor(){
        if (professor == null)
            return;

        professor = null;
    }
    public void adicionarLinhaSumario(String linha){
        if (linha == null)
            return;
        sumario.append(linha).append('\n');
    }
    public boolean isSobre(Horario horario) {
        if (horario == null)
            return false;
        return (this.horario.getHoraInicio() >=  horario.getHoraInicio()) && (this.horario.getHoraFim() <= horario.getHoraFim());
    }
}
