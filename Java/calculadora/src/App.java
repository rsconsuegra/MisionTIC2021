import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL path_view = getClass().getResource("vista_principal.fxml");
        FXMLLoader loader = new FXMLLoader(path_view);

        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
