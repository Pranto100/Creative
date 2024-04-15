/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
 * @author User
 */
public class QcmMainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onqcmLivestockButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("qcmLivestock.fxml"));
    Parent qcmLivestocksceneParent = loader.load();
    Scene qcmLivestockscene = new Scene(qcmLivestocksceneParent);
    Stage qcmLivestockstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    qcmLivestockstage.setScene(qcmLivestockscene);
    qcmLivestockstage.show();
        
    }

    @FXML
    private void onqcmDeliveriesButtonClicked(ActionEvent event) throws IOException {
        
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("qcmDeliveries.fxml"));
    Parent qcmDeliveriessceneParent = loader.load();
    Scene qcmDeliveriesscene = new Scene(qcmDeliveriessceneParent);
    Stage qcmDeliveriesstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    qcmDeliveriesstage.setScene(qcmDeliveriesscene);
    qcmDeliveriesstage.show();
        
    }

    @FXML
    private void onqcmFeedbackButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("qcmFeedback.fxml"));
    Parent qcmFeedbacksceneParent = loader.load();
    Scene qcmFeedbackscene = new Scene(qcmFeedbacksceneParent);
    Stage qcmFeedbackstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    qcmFeedbackstage.setScene(qcmFeedbackscene);
    qcmFeedbackstage.show();
    }

    @FXML
    private void onqcmReportButtonClicked(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("qcmReport.fxml"));
    Parent qcmFeedbacksceneParent = loader.load();
    Scene qcmFeedbackscene = new Scene(qcmFeedbacksceneParent);
    Stage qcmFeedbackstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    qcmFeedbackstage.setScene(qcmFeedbackscene);
    qcmFeedbackstage.show();
    }

    @FXML
    private void onqcmCustomersButtonClicked(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("qcmCustomers.fxml"));
    Parent qcmCustomerssceneParent = loader.load();
    Scene qcmCutomersscene = new Scene(qcmCustomerssceneParent);
    Stage qcmCustomersstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    qcmCustomersstage.setScene(qcmCutomersscene);
    qcmCustomersstage.show();
    }

    @FXML
    private void onqcmSwitchButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dmMain.fxml"));
    Parent dmMainsceneParent = loader.load();
    Scene dmMainscene = new Scene(dmMainsceneParent);
    Stage dmMainstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmMainstage.setScene(dmMainscene);
    dmMainstage.show();
    }
    
}
