package control;
import java.util.ArrayList;
import java.util.List;
import modelo.ListaParticipantes;
public class ListaParticipantesc {
    private List<ListaParticipantes> campeonato= new ArrayList<ListaParticipantes>();

       public List<ListaParticipantes> getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(List<ListaParticipantes> campeonato) {
        this.campeonato = campeonato;
    }

    public boolean salvar(ListaParticipantes user){
        if(user != null){
            campeonato.add(user);
            return true;
        }
        return false;
    }

    public List<ListaParticipantes> retornarTodos(){
        return campeonato;
    }

}
