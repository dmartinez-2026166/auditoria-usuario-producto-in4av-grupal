package com.diegomartinez.system.controller;

import com.diegomartinez.system.utils.Validations;
import com.diegomartinez.system.utils.ViewFactory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegisterController implements Initializable {

    @FXML
    private PasswordField pwdConfirmPassword;
    @FXML
    private PasswordField pwdPassword;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtUser;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnCreateUser;
    private Validations validate = new Validations();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void onCancelRegister(MouseEvent event) {
        ViewFactory viewFacto = new ViewFactory();
        viewFacto.viewLogin();
    }
    
    @FXML
    public void OnRegisterUser(MouseEvent event) {
        String email = txtEmail.getText().trim();
        boolean validEmail = validate.validateEmail(email);
        if(validEmail == true) {
            System.out.println("Si está válido");
        } else {
            System.out.println("NO está válido");
        }
    }
}
