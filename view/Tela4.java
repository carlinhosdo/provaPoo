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


public class Tela4 implements Initializable{

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

    Alert latido = new Alert(AlertType.NONE);
    @FXML
    void calculo(ActionEvent event) {
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
        String nome = TF_nome.getText();
        String  vencimento = TF_vencimento.getText();
        Agendamento agenda = new Agendamento(nome, vencimento);
        latido.setAlertType(AlertType.INFORMATION);
        latido.setHeaderText("informaçoes");
        latido.setContentText(agenda+"");
        latido.show();
            
        
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
