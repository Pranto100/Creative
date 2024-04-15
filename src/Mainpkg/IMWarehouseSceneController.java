/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

import java.io.IOException;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class IMWarehouseSceneController implements Initializable {

    @FXML
    private TextField inventoryNoTextField;
    @FXML
    private TextField qtyTextField;
    @FXML
    private TextField priceTextField;
    @FXML
    private ComboBox<String> inventoryTypeComboBox;
    @FXML
    private TableView<Warehouse> wareHouseTableView;
    @FXML
    private TableColumn<Warehouse,Integer> inventoryNoTableColumn;
    @FXML
    private TableColumn<Warehouse,String> typeTableColumn;
    @FXML
    private TableColumn<Warehouse,String> nameTableColumn;
    @FXML
    private TableColumn<Warehouse,Integer> quantityTableColumn;
    @FXML
    private TableColumn<Warehouse,Float> priceTableColumns;

    
    ArrayList<Warehouse>warehouseList;
    @FXML
    private TextField inventoryNameTextField;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inventoryTypeComboBox.getItems().addAll("Greenery","Medicine","Suppliments");
        warehouseList = new ArrayList<>();
        
        inventoryNoTableColumn.setCellValueFactory(new PropertyValueFactory<Warehouse,Integer>("goodNo"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<Warehouse,String>("type"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Warehouse,String>("goodName"));    
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<Warehouse,Integer>("quantity"));
        priceTableColumns.setCellValueFactory(new PropertyValueFactory<Warehouse,Float>("price"));
  
    }    
    @FXML
    private void saveToWarelistButton(ActionEvent event) {
        //to save warehouse details from textfields to the warehouseList
     Warehouse ware=  new Warehouse (Integer.parseInt(inventoryNoTextField.getText()),
              Integer.parseInt(qtyTextField.getText()) ,
               inventoryNameTextField.getText() ,
                inventoryTypeComboBox.getValue(),
                Float.parseFloat(priceTextField.getText())
                );
        
        wareHouseTableView.getItems().add(ware);
        
              }

    @FXML
    private void sceneChangeToDetailsScene(ActionEvent event) throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("IMViewInventoryDetails"));
        Scene scene = new Scene(root);
        //stage
        Stage stgToDetails = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stgToDetails.setScene(scene);
        stgToDetails.show();
       
    }

}
