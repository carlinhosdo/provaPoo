import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String args[]) throws Exception {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("view/Tela1.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);
        tela.getStylesheets().add(getClass().getResource("view/app.css").toString());
       
        primaryStage.setResizable(false);
        primaryStage.setTitle("ESCOLINHA CESAR SURF");
        primaryStage.setScene(tela);
        
        primaryStage.show();
    }
 
}