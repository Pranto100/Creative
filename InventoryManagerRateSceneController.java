/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InventoryManagerRateSceneController implements Initializable {

    @FXML
    private TextField membershipIDTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextArea rateOutputTextArea;
    @FXML
    private TextField rateTextField;

    ArrayList<Rate>rateList;
    @FXML
    private DatePicker rateDatePicker;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
         rateList= new ArrayList<>();
    }    

    @FXML
    private void AddRateToTextAreaButton(ActionEvent event) {
        Rate r = new Rate (
                 Integer.parseInt(membershipIDTextField.getText()),
                 nameTextField.getText(),
                 Integer.parseInt(rateTextField.getText()),
                 rateDatePicker.getValue()
            );
        membershipIDTextField.clear();
        nameTextField.clear();
        rateTextField.clear();
        
        
        
              
            rateOutputTextArea.setText(r.toString()+"\n");
        
              }
        
    }
        
