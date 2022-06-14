package view;

import java.io.IOException;



import control.ListaParticipantesc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.ListaParticipantes;

public class Tela3 {


    @FXML
    private Button cadastro;

    @FXML
    private Button verLista;


    @FXML
    private TextField cpf;

    @FXML
    private TextField nome;

    @FXML
    private Button voltar;

 
    ListaParticipantesc cv = new ListaParticipantesc();

    @FXML
    void voltarInformacao(ActionEvent event) throws IOException {
        Funcoes voltar = new Funcoes();         
        voltar.abrirTela(event,"Tela2.fxml","app.css");
    }

    @FXML
    void verTodos(ActionEvent event) throws IOException {
        Funcoes voltar = new Funcoes();
        voltar.abrirTela(event,"Tela5.fxml","app.css");
    }

    @FXML
    void cadastroCampeonato(ActionEvent event) {
        ListaParticipantes user = new ListaParticipantes();
        user.setNome(nome.getText());
        user.setCpf(cpf.getText());


    }
}
