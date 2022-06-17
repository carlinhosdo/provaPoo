package control;
import modelo.Agendamento;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class Agendamentoc {
    Alert latido = new Alert(AlertType.NONE);
    private ArrayList<Agendamento> listaAgendamento = new ArrayList<Agendamento>();

    public boolean AdicionarAgendamento(Agendamento agendamento){
        if(!consultarAgendamento(agendamento.getNome())){
            listaAgendamento.add(agendamento);
            this.mostrarAgendamento();
            return true;
        }
        return false;
    }
    
    public boolean consultarAgendamento(String nome){
        boolean retorno = false;
        for(Agendamento agendamento : listaAgendamento){
            if(agendamento.getNome().equals(nome)){
                retorno = true;
                latido.setAlertType(AlertType.ERROR);
                latido.setTitle("leia a informação");
                latido.setHeaderText("Erro ao efetuar o cadastro");
                latido.setContentText("\nFilho daa puta você já ta cadastrado");
                latido.show();
               
            }
            
        }
        return retorno;

    }
    public void mostrarAgendamento(){
        for(Agendamento agendamento : listaAgendamento){
            System.out.println("nome: "+agendamento.getNome());
            System.out.println("Quantidade de dias pegue: " +agendamento.getQuantidade());
            System.out.println("vencimento: " +agendamento.getVencimento()); 

        }
    }
}
