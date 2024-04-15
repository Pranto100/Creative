/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cattleinfo;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ViewInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackToCattleInfoOnClicked(ActionEvent event) 
            throws IOException {
        
    FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource("Cattleinfo1.fxml"));
    Parent ciOrdersceneParent = loader.load();
    Scene ciOrderscene = new Scene(ciOrdersceneParent);
    Stage ciOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    ciOrderstage.setScene(ciOrderscene);
    ciOrderstage.show();
        
    }
    
    
}
