package view;

import java.io.IOException;



import control.ListaParticipantesc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modelo.ListaParticipantes;
import javafx.scene.Node;

public class Tela3 {
        Parent root;
        Stage tela;
        Scene cena;

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

    Alert chris = new Alert(AlertType.NONE);

    ListaParticipantesc cv = new ListaParticipantesc();

    @FXML
    void voltarInformacao(ActionEvent event) throws IOException {
        Funcoes voltar = new Funcoes();         
        voltar.abrirTela(event,"Tela2.fxml","app.css");
    }

    @FXML
    void verTodos(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tela5.fxml"));
        root = loader.load();
        cena = new Scene(root);
        cena.getStylesheets().addAll(getClass().getResource("app.css").toString());
        tela = (Stage)((Node)event.getSource()).getScene().getWindow();
        tela.setResizable(false);
        tela.setScene(cena);
        Tela5 tela5 = loader.getController();
        tela5.setControle(cv);
        tela5.initialize(null, null);
        tela.show();
        
    }

    @FXML
    void cadastroCampeonato(ActionEvent event) {
        if (nome.getText().equals("") && cpf.getText().equals("")) {
            chris.setAlertType(AlertType.ERROR);
            chris.setTitle("leia a informação");
            chris.setHeaderText("Erro ao efetuar o cadastro");
            chris.setContentText("\nFilho daa puta você não preencheu nada");
            chris.show();
         } else{
       chris.setAlertType(AlertType.INFORMATION);
        chris.setHeaderText("Add Usuário");
        chris.setContentText("Usuário adicionado com sucesso");
        chris.show();
        ListaParticipantes participante = new ListaParticipantes();
        participante.setNome(nome.getText());
        participante.setCpf(cpf.getText());
        cv.getCampeonato().add(participante);
         }

    }

}
