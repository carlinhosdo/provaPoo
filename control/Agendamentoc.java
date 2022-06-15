package control;
import modelo.Agendamento;
import java.util.ArrayList;

public class Agendamentoc {
    private ArrayList<Agendamento> agendamento = new  ArrayList<Agendamento>();

    public void adicionadarAgendamento(Agendamento tv){
        if(tv != null)
        agendamento.add(tv);
    }
    public ArrayList<Agendamento> getAgendamento(){
        return agendamento;
    }


}
