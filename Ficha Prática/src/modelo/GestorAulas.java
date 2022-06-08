package modelo;

import java.util.LinkedList;

public class GestorAulas {
    protected LinkedList<Aula> aulas;
    protected AssociavelAulas associavelAulas;

    public GestorAulas(AssociavelAulas associavelAulas) {
        this.associavelAulas = associavelAulas;
        aulas = new LinkedList<>();
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasSobreHorario = new LinkedList<>();
        for (Aula aula : aulas){
            if (aula.isSobre(horario)){
                aulasSobreHorario.add(aula);
            }
        }
        return aulasSobreHorario;
    }

    public void adicionar(Aula aula) {
        if (aula == null)
            return;
        if (aulas.contains(aula))
            return;
        aulas.add(aula);
        associavelAulas.associar(aula);
    }

    public void remover(Aula aula) {
        if (aula == null)
            return;
        if (!aulas.contains(aula))
            return;
        aulas.remove(aula);
        associavelAulas.associar(aula);
    }

    public boolean contem(Aula aula) {
        return aulas.contains(aula);
    }
}
