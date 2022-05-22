package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.model.User;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
    @FXML
    private Button registerButton;

    @FXML
    private Label signUpLabel, kiwiLabel, registrationLabel;

    @FXML
    private TextField usernameTextField, registrationField;

    @FXML
    private PasswordField passwordField, confirmPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void registerButtonOnAction(ActionEvent event) {
        if (usernameTextField.getText().isBlank() || passwordField.getText().isBlank() || confirmPasswordField.getText().isBlank() || registrationField.getText().isBlank()) {
            registrationLabel.setText("Do not leave any fields empty");
        } else {
            if (passwordField.getText().equals(confirmPasswordField.getText())) {
                try {
                    registrationLabel.setText("");
                    UserService.addUser(usernameTextField.getText(), passwordField.getText(), registrationField.getText());
                } catch (UsernameAlreadyExistsException e) {
                    registrationLabel.setText("Username already exists!");
                }
            } else {
                registrationLabel.setText("Password and Confirm password fields do not match!");
            }
        }
    }

    public void homeButtonOnAction(ActionEvent event) {

    }

    public void menuButtonOnAction(ActionEvent event) {

    }

    public void chatButtonOnAction(ActionEvent event) {

    }

    public void goToLogIn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        Stage primaryStage = (Stage) registerButton.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("login.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();
    }
}
