
package library.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

public class LoginGuiController implements Initializable{

    
    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField Login;

    @FXML
    private JFXPasswordField Passwd;

    private String password; 
    private String login; 
    
    

    @FXML
    void forgotPassword(ActionEvent event) throws IOException{
            
           Parent root = FXMLLoader.load(getClass().getResource("/libraryGui/ForgotPasswordGui.fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
    }

    @FXML
    void login(ActionEvent event) throws IOException{
        password = Passwd.getText();
        login = Login.getText();
        
          if(login.equals("login") && password.equals("password") )
          {
              
          }else {
                    if(login.equals("login")== false)
                    {
                        Login.setText("Wrong Login");
                        //Login.setBackground(Background.EMPTY);
                    }
                    if(password.equals("password") == false)
                    {
                        Passwd.setText("WRong Password");
                       // Passwd.setBackground(Background.EMPTY);
                    }
              
          }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
}