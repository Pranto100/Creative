/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginSceneController implements Initializable {

    private ComboBox<String> userTypeCB;
    @FXML
    private CheckBox fsCheckBox;
    @FXML
    private CheckBox imCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        
      if(imCheckBox.isSelected())
      { Parent root;
            root= FXMLLoader.load(getClass().getResource("IMDashboardScene.fxml"));
            Scene scene = new Scene (root);
            Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
            stg.setScene(scene);
            stg.show();
      }
      if(fsCheckBox.isSelected())
          { Parent root;
            root= FXMLLoader.load(getClass().getResource("FSDashboardScene.fxml"));
            Scene scene = new Scene (root);
            Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
            stg.setScene(scene);
            stg.show();
      }
        
        
                    
        
                
      
}
    }