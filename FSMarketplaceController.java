/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FSMarketplaceController implements Initializable {

    @FXML
    private ComboBox<String> productTypeComboBox;
    @FXML
    private TextField productIDTextField;
    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField priceTextField;
    @FXML
    private TextField productDescriptionTextField;
    @FXML
    private TextArea productListTextArea;
    @FXML
    private TableView<Product> productTableView;
    @FXML
    private TableColumn<Product, Integer> ProductIDTableColumn;
    @FXML
    private TableColumn<Product, String> productTypeTableColumn;
    @FXML
    private TableColumn<Product, String> productNameTableColumn;
    @FXML
    private TableColumn<Product, String> descriptionTableColumn;
    @FXML
    private TableColumn<Product, Float> priceTableColumn;
   
    ArrayList<Product>productList = new ArrayList<>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productTypeComboBox.getItems().addAll("Greenery","Medicine","Suppliment");
        
        ProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<Product,Integer>("productId"));
        productTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("type"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<Product,String>("description"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Product,Float>("price"));
    }    

    @FXML
    private void addToShopListbutton(ActionEvent event) {
        Product product = new Product( Integer.parseInt(productIDTextField.getText()),
                                 productTypeComboBox.getValue(),
                                productNameTextField.getText(),
                               productDescriptionTextField.getText()  ,
                                      Float.parseFloat(priceTextField.getText())                      
        );
        
          productList.add(product);  
          
  
      productTableView.getItems().add(product);
      
      for (Product p: productList)
          productListTextArea.setText(p.toString()+"\n");
   
    }

    @FXML
    private void writeInBinFileButton(ActionEvent event) {
        
    }

    @FXML
    private void readFromBinFileButton(ActionEvent event) {
    }
    
}
