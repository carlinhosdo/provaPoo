package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import control.ListaParticipantesc;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.ListaParticipantes;


public class Tela5 implements Initializable{

    public Tela5(){

    }
    public Tela5(ListaParticipantesc controle){
        this.controle = controle;
    }

    private ListaParticipantesc controle = new ListaParticipantesc();

    @FXML
    private TableColumn<ListaParticipantes, String> modalidade;

    @FXML
    private TableColumn<ListaParticipantes, String> nome;

    @FXML
    private TableView<ListaParticipantes> tabela;

    @FXML
    private Button vai;

    @FXML
    void simbora(ActionEvent event) throws IOException {
        Funcoes campo = new Funcoes();
        campo.abrirTela(event,"Tela3.fxml", "app.css");
      
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        modalidade.setCellValueFactory(new PropertyValueFactory<>("cpf"));    
        tabela.setItems(listaParticipantes()); 
    }
    public ObservableList<ListaParticipantes> listaParticipantes(){
        
        return FXCollections.observableArrayList(controle.retornarTodos());
    }
    public void setControle(ListaParticipantesc controle){
        this.controle = controle;
    }

}





