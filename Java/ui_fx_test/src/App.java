import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    // launch the application
    public void start(Stage stage) {

        try {
            // set title for the stage
            stage.setTitle("Pane");

            // create a label
            Label label = new Label("this is Pane example");

            // relocate label
            label.relocate(100, 10);

            // create a Pane
            Pane pane = new Pane(label);

            // add buttons
            for (int i = 0; i < 5; i++) {

                // create button
                Button button = new Button("Button " + (int) (i + 1));

                // add button
                pane.getChildren().add(button);

                // relocate button
                button.relocate(100, 50 + 40 * i);
            }

            // create a scene
            Scene scene = new Scene(pane, 400, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[]) {

        // launch the application
        launch(args);
    }
}