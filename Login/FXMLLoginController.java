package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLLoginController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button SignIN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Initialize the controller
    }

    @FXML
    public void ActionSignIN(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // TODO: Implement login logic here
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
            // You can add code here to navigate to another scene or perform other actions
        } else {
            System.out.println("Login failed. Please check your username and password.");
            // You can add code here to show an error message or perform other actions
        }
    }
}
