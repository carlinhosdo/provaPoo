package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Tela2 {

    @FXML
    private Button agendamento;

    @FXML
    private Button compeonato;

    @FXML
    private Button doacao;

    @FXML
    private ToggleGroup infor;

    @FXML
    private Button confirmacao;


    @FXML
    private Label minhaLabel;

    @FXML
    private RadioButton rButton1;

    @FXML
    private RadioButton rButton2;

    @FXML
    private RadioButton rButton3;

    @FXML
    void abrirAgendamento(ActionEvent event) {
       
    }

    @FXML
    void abrirCompeonato(ActionEvent event) throws IOException {
        Funcoes campo = new Funcoes();
        campo.abrirTela(event,"Tela3.fxml", "app.css");

    }

    @FXML
    void abrirDoacao(ActionEvent event) throws IOException {
        Funcoes doacao = new Funcoes();
        doacao.abrirTela(event,"Tela4.fxml", "app.css");
        
    }
    @FXML
    void voltarConfirmacao(ActionEvent event) throws IOException {
        Funcoes confirmacao = new Funcoes();
        confirmacao.abrirTela(event,"Tela1.fxml", "app.css");

    }

    @FXML
    void classificacao(ActionEvent event) {
    if(rButton1.isSelected()){
        minhaLabel.setText("ok");
    }else if(rButton2.isSelected()){
        minhaLabel.setText("tv");
    }else if(rButton3.isSelected()){
        minhaLabel.setText("mae");

    }
    }

}
