package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

import javax.swing.text.html.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Button loginButton;

    @FXML
    private Label createAccount, signInLabel, kiwiLabel, loginTextLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void loginButtonOnAction() {
        try {
            UserService.findUser(usernameTextField.getText(),passwordField.getText());
            loginTextLabel.setText("Username and Password do not match to an existing account!");
        } catch (UsernameAlreadyExistsException e) {
            loginTextLabel.setText("Logged in!");
        }
    }

    public void homeButtonOnAction(ActionEvent event) {

    }

    public void menuButtonOnAction(ActionEvent event) {

    }

    public void chatButtonOnAction(ActionEvent event) {

    }

    public void createAccountOnAction(ActionEvent event) {

    }

    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();
    }
}
