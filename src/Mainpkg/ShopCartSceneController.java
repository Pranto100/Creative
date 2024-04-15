/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ShopCartSceneController implements Initializable {

    @FXML
    private TextField nameTF;
    @FXML
    private TextField quantityTF;
    @FXML
    private TextField priceTF;
    @FXML
    private ComboBox<String> typeCB;
    @FXML
    private TextArea cartTextArea;
    ArrayList<Cart>cartList;
    @FXML
    private TextArea billTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeCB.getItems().addAll("Greenery","Medicine","Suppliments");
        
        cartList= new ArrayList<>();
    }   

    @FXML
    private void showProductInTextAreaButton(ActionEvent event) throws ClassNotFoundException {
        Cart c= new Cart(nameTF.getText(),
                             typeCB.getValue() ,
        Integer.parseInt(quantityTF.getText()),
        Integer.parseInt(priceTF.getText()) );
        
        cartList.add(c);
       
        
            
       cartTextArea.appendText(c.toString());
       int n=  c.calculateTotalPrice();
       
      
      
       
     
       
        }
        
       

    @FXML
    private void billSceneButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BillReceiptTableScene.fxml"));
        Scene scene = new Scene(root);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(scene);
        newStage.show();
        
        
        
    }

    private void writeCartButton(ActionEvent event) {
      try{  FileOutputStream fos = new FileOutputStream("cart.bin",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for (Cart c:cartList)
            oos.writeObject(c);
        
        oos.close();
                
    }catch(IOException e)
    {}
    
}
}