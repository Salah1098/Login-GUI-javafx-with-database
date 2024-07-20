package com.Login_GUI;

import com.Login_GUI.dao.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button loginButton;

    private UserModel userModel;

    @FXML
    protected void initialize() {
        userModel = new UserModel();
        loginButton.setOnAction(event -> handleLoginButtonAction());
    }

    protected void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (userModel.authenticate(username, password)) {
            messageLabel.setText("Login successful!");
            messageLabel.setTextFill(Color.WHITE);
            // يمكنك التوجيه إلى واجهة أخرى بعد تسجيل الدخول بنجاح هنا
        } else {
            messageLabel.setText("Invalid username or password.");
            messageLabel.setTextFill(Color.RED);
        }
    }
}