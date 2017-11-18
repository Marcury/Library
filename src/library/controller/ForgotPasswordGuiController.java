
package library.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ForgotPasswordGuiController implements Initializable {

    @FXML
    private JFXTextField Answer;

    @FXML
    private JFXButton SearchButton;

    @FXML
    private JFXTextField Login;

    @FXML
    private JFXTextField Sname;

    @FXML
    private JFXButton SendButton;
    
    @FXML
    private Label securityQuestion;

    @FXML
    private JFXTextField Name;
    
    private String name;
    private String sname;
    private String login;
    private String answer;

    @FXML
    void sendAnswer(ActionEvent event) throws IOException{
        
        answer = Answer.getText();
        
        if (answer.equals("DO EDYCJI"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("/libraryGui/PassChangeGui.fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }else {
            Answer.clear();
            Answer.setPromptText("Błędna Odpowiedź");
            Answer.setStyle("-fx-background-color: #ff000092");
                    
        }

    }
    
    @FXML
    void searchQuestion(ActionEvent event) {
            sname = Sname.getText();
            name = Name.getText();
            login = Login.getText();
            
            if(sname.equals(sname) && name.equals(name) && login.equals(login))
            {
                securityQuestion.setText("Jakieś Pytanie");
            }
            
    }
   
    @FXML
    void clearAnswer(ActionEvent event) {
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
