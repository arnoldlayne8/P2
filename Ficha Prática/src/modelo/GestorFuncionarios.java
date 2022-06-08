package modelo;

import java.util.LinkedList;

public class GestorFuncionarios<TGabinete extends Gabinete, TDivisao extends Divisao> {

    private LinkedList<Horario> horariosAtendimento;
    private TGabinete gabinete;
    private Funcionario<TGabinete, TDivisao> funcionario;
    public GestorFuncionarios(Funcionario<TGabinete, TDivisao> funcionario) {
        this.funcionario = funcionario;
    }

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
    public void abrirGabinete(){
        this.gabinete.setAberta(true);
    }
    public void fecharGabinete(){
        this.gabinete.setAberta(false);
    }
    public void abrir(TDivisao divisao){
        divisao.setAberta(true);
    }
    public void fechar(TDivisao divisao){
        divisao.setAberta(false);
    }
    public void atribuir(TGabinete gabinete){
        if (gabinete == null || gabinete == this.gabinete)
            return;
        this.gabinete = gabinete;
    }
    public void desassociar(){
        if (this.gabinete == null)
            return;
        this.gabinete = null;
    }
    public TGabinete getGabinete() {
        return gabinete;
    }
    public void desassociarGabinete() {
        gabinete = null;
    }
}
