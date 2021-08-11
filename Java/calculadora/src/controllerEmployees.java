import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class controllerEmployees {
    @FXML
    private TextField name;

    @FXML
    private TextField rol;

    @FXML
    private TextArea resultados;

    @FXML
    private Button agregar;

    @FXML
    private TextField id;

    @FXML
    private TextField time_in_company;

    @FXML
    private TextField salary;

    @FXML
    private Label label_ejemplo;

    @FXML
    private Button operar;

    @FXML
    private Button tercero;

    private Employee[] empleados = new Employee[100];
    private modelEmployee model = new modelEmployee();
    private int number_of_employees = 0;
    // modelEmployee empleados = new modelEmployee();

    @FXML
    void btn_agregar(ActionEvent event) {
        String employee_name = name.getText();
        int employee_id = Integer.parseInt(id.getText());
        String employee_rol = rol.getText();
        int employee_comp_time = Integer.parseInt(time_in_company.getText());
        double employee_salary = Double.parseDouble(salary.getText());

        empleados[number_of_employees] = new Employee(employee_name, employee_id, employee_rol, employee_comp_time,
                employee_salary);
        number_of_employees++;
    }

    @FXML
    void btn_operar(ActionEvent event) {
        String message = model.getMaxSalaryBonification(empleados, number_of_employees);
        resultados.setText(message);
    }

    @FXML
    void btn_saludar(ActionEvent event) {
        System.out.println("Holaaaa");
        label_ejemplo.setText("Holaaaa");
    }
}
