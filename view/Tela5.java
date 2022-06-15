package view;

import java.net.URL;
import java.util.ResourceBundle;

//import control.ListaParticipantesc;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.ListaParticipantes;

public class Tela5 implements Initializable{

    //private ListaParticipantesc controle = new ListaParticipantesc();

    @FXML
    private TableColumn<ListaParticipantes, String> modalidade;

    @FXML
    private TableColumn<ListaParticipantes, String> nome;

    @FXML
    private TableView<ListaParticipantes> tabela;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        modalidade.setCellValueFactory(new PropertyValueFactory<>("cpf"));     
       // tabela.setItems(listaParticipantes());  
    }
    //private ObservableList<ListaParticipantes> listaParticipantes(){//
        
    }





