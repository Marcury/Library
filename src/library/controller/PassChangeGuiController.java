/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PassChangeGuiController implements Initializable {

    
     @FXML
    private JFXButton changePassButton;

    @FXML
    private JFXPasswordField NewPass;

    @FXML
    private JFXPasswordField NewPassRepeat;
    
    @FXML
    private JFXButton BackButton;
    
    @FXML
    private Label NewPassLabel;
    
    private String newPassword;
    private String newPasswordRepeat;

    @FXML
    void changePassword(ActionEvent event) {
        
        newPassword = NewPass.getText();
        newPasswordRepeat = NewPassRepeat.getText();
        
       if (newPassword.equals(newPasswordRepeat));
       {
           NewPass.setText("");
           NewPass.setDisable(true);
           NewPassRepeat.setText("");
           NewPassRepeat.setDisable(true);
           changePassButton.setDisable(true);
           
           NewPassLabel.setText("Hasło Zmienione");
           NewPassLabel.setVisible(true);
           BackButton.setVisible(true);
           BackButton.setDisable(false);
       }

    }
    
     @FXML
    void backToLogin(ActionEvent event) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("/libraryGui/LoginGui.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
