package modelo;

import java.util.LinkedList;

public abstract class Gabinete<TFuncionario extends Funcionario> extends Divisao {

    protected LinkedList<TFuncionario> funcionarios;

    public Gabinete(String nome, boolean aberta) {
        super(nome, aberta);
        this.funcionarios = new LinkedList<>();
    }

    public LinkedList<TFuncionario> getFuncionarios() {
        return new LinkedList<>(funcionarios);
    }

    public void adicionar(TFuncionario funcionario){
        if(funcionario == null || funcionarios.contains(funcionario))
            return;
        this.funcionarios.add(funcionario);
        funcionario.atribuirGabinete(this);
    }

    public void remover(TFuncionario funcionario){
        if (funcionario == null || !funcionarios.contains(funcionario))
            return;
        this.funcionarios.remove(funcionario);
        funcionario.desassociarGabinete();
    }
}
