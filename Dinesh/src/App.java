import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class App extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("dinesh.fxml"));
        Scene scene=new Scene(root,600,700);       
        primaryStage.setScene(scene);
        primaryStage.setTitle("Teacher");
        primaryStage.show();  
    }
    public static void main(String[] args) {
        launch(args);
    }
}