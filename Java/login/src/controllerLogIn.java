import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class controllerLogIn {

    @FXML
    private TextField user;

    @FXML
    private Button log;

    @FXML
    private Text result_text;

    @FXML
    private PasswordField pswrd;

    @FXML
    private TextArea result;

    @FXML
    void actionLogIn(ActionEvent event) {
        System.out.println(user.getText() + " " + pswrd.getText());
        if (user.getText().equalsIgnoreCase("randy")) {
            result_text.setText("Bienvenido Randy!");
        } else {
            result_text.setText("Usuario invalido");
        }

        result.setText(user.getText() + " " + pswrd.getText());
    }

}