package modelo;

import java.util.LinkedList;

public class GestorFuncionarios<TGabinete extends Gabinete, TDivisao extends Divisao> {

    protected LinkedList<Horario> horariosAtendimento;
    protected TGabinete gabinete;
    protected Funcionario<TGabinete, TDivisao> funcionario;

    //Contrutores
    public GestorFuncionarios(Funcionario<TGabinete, TDivisao> funcionario) {
        this.horariosAtendimento = new LinkedList<>();
        this.funcionario = funcionario;
        this.gabinete = null;
    }

    //Métodos de Horário
    public LinkedList<Horario> getHorariosAtendimento() {
        return new LinkedList<>(horariosAtendimento);
    }

    public void adicionar(Horario horarioAtendiemento){
        if(horarioAtendiemento == null || horariosAtendimento.contains(horarioAtendiemento))
            return;
        this.horariosAtendimento.add(horarioAtendiemento);
    }

    public void remover(Horario horarioAtendimento){
        if (horarioAtendimento == null || !horariosAtendimento.contains(horarioAtendimento))
            return;
        this.horariosAtendimento.remove(horarioAtendimento);
    }


    //Métodos de Gabinete

    public TGabinete getGabinete() {
        return gabinete;
    }

    public void atribuirGabinete(TGabinete gabinete){
        if (gabinete == null || gabinete == this.gabinete)
            return;
        this.gabinete = gabinete;
    }

    public void desassociarGabinete(){
        if (this.gabinete == null)
            return;
        this.gabinete = null;
    }

    public void abrirGabinete(){
        this.gabinete.setAberta(true);
    }

    public void fecharGabinete(){
        this.gabinete.setAberta(false);
    }


    //Métodos de Sala

    public void abrir(TDivisao divisao){
        divisao.setAberta(true);
    }

    public void fechar(TDivisao divisao){
        divisao.setAberta(false);
    }

}
