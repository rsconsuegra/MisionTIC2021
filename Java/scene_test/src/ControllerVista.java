import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerVista {

    @FXML
    private Button btn_execute;

    @FXML
    private TextField nombre;

    @FXML
    private TextField id;

    @FXML
    private TextField municipio;

    @FXML
    private TextField irca;

    @FXML
    private TextArea area_mostrar;

    @FXML
    void mostrarDatos(ActionEvent event) {
        area_mostrar.appendText("Hola" + nombre.getText());
    }

}
