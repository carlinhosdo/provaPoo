package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import modelo.Agendamento;
import control.Agendamentoc;

public class Tela4 implements Initializable{

    private Agendamentoc controle = new Agendamentoc();

    @FXML
    private DatePicker DatePicker;

    @FXML
    private TextField TF_dias;

    @FXML
    private TextField TF_vencimento;

    @FXML
    private Button calcular;

    @FXML
    private Button voltar_;

    @FXML
    private TextField TF_nome;

    Alert alerta = new Alert(AlertType.NONE);
    @FXML
    void calculo(ActionEvent event) {
        if(TF_nome.getText().equals("") && TF_dias.getText().equals("")){
            alerta.setAlertType(AlertType.ERROR);
            alerta.setTitle("leia a informação");
            alerta.setHeaderText("Erro ao efetuar o cadastro");
            alerta.setContentText("\nFilho daa puta você não preencheu nada");
            alerta.show();

        }else{
            LocalDate data = DatePicker.getValue();
            Calendar manipular = Calendar.getInstance();
            int dias =Integer.valueOf(TF_dias.getText());
            java.util.Date dia =  Date.from(data.atStartOfDay(ZoneId.systemDefault()).toInstant());
            manipular.setTime(dia);
            manipular.add(Calendar.DAY_OF_MONTH, dias);
            dia=manipular.getTime();
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            String data_vencimento=formatar.format(dia);
            TF_vencimento.setText(data_vencimento);
            Agendamento agendamento = new Agendamento();
            agendamento.setNome(TF_nome.getText());
            agendamento.setQuantidade(TF_dias.getText());
            agendamento.setVencimento(TF_vencimento.getText());
            if(controle.AdicionarAgendamento(agendamento)){
                alerta.setAlertType(AlertType.INFORMATION);
                alerta.setTitle("aluguel concluido ");
                alerta.setHeaderText("Passa gonorreia pros amigos, cê sabe que é brava");
                alerta.setContentText("\nMano, vai pra puta que pariu,Eu tô aqui pensando no passado na vadia que me traiu");
                alerta.show();
                
            }   

        }
            
    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
        Funcoes voltar = new Funcoes();         
        voltar.abrirTela(event,"Tela2.fxml","app.css");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

}
