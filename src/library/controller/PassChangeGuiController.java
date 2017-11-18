/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PassChangeGuiController implements Initializable {

    
     @FXML
    private JFXButton changePassButton;

    @FXML
    private JFXTextField NewPass;

    @FXML
    private JFXTextField NewPassRepeat;
    
    private String newPassword;
    private String newPasswordRepeat;

    @FXML
    void changePassword(ActionEvent event) {
        
        newPassword = NewPass.getText();
        newPasswordRepeat = NewPassRepeat.getText();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
