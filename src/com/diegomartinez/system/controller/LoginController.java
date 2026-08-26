package com.diegomartinez.system.controller;

import com.diegomartinez.system.utils.ViewFactory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable{
    @Override 
    public void initialize(URL url, ResourceBundle rb){
    
    }
    
    @FXML
    public void onRegister(MouseEvent event){
        ViewFactory viewFacto = new ViewFactory();
        viewFacto.viewRegister();
    }
}
