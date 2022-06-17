package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import control.UsuarioC;
import modelo.Usuario;

public class Tela1 {
    private UsuarioC controle = new UsuarioC();
    @FXML
    private Button btnTela1;

    @FXML
    private TextField idade; 

    @FXML
    private TextField nome;
    
    @FXML
    private AnchorPane paneTela;


    Alert latido = new Alert(AlertType.NONE);

    @FXML
    void irTela2(ActionEvent event) throws Exception {
        if (nome.getText().equals("") && idade.getText().equals("")) {
            latido.setAlertType(AlertType.ERROR);
            latido.setTitle("leia a informação");
            latido.setHeaderText("Erro ao efetuar o cadastro");
            latido.setContentText("\nFilho daa puta você não preencheu nada");
            latido.show();
        } else if (Integer.parseInt(idade.getText()) < 12) {
            latido.setAlertType(AlertType.ERROR);
            latido.setTitle("leia a informação");
            latido.setHeaderText("Erro ao efetuar o cadastro");
            latido.setContentText( "\nFilho da puta tu tem menos de 12 anos, sendo assim você não frequenatar a escolina Cesar Surf.\n Classifiçaõ: 12 anos ");
            latido.show();
        }else{
            Usuario user = new Usuario();
            user.setNome(nome.getText());
            user.setIdade(Integer.parseInt(idade.getText()));
            if(controle.adicionarUsuario(user)){
                latido.setAlertType(AlertType.INFORMATION);
                latido.setHeaderText("Add Usuário");
                latido.setContentText("USuário adicionado com sucesso");
                latido.show();
                Funcoes funcoes = new Funcoes();
                funcoes.abrirTela(event, "Tela2.fxml", "app.css");
            }
        }
    }
}
