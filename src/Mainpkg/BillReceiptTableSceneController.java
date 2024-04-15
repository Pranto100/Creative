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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BillReceiptTableSceneController implements Initializable {

    @FXML
    private TextField nameTF;
    @FXML
    private TextField typeTF;
    @FXML
    private TextArea totalBillTextArea;
    @FXML
    private TextField quantityTF;
    @FXML
    private TextField priceTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void rateSceneButton(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("InventoryManagerRateScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage)((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
            stg.show();
    }
    
}
