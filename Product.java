/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Product implements Serializable {
    private int productId;
    private String type,productName, description;
    private float price;

    public Product(int productId, String type, String productName, String description, float price) {
        this.productId = productId;
        this.type = type;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", type=" + type + ", productName=" + productName + ", description=" + description + ", price=" + price + '}';
    }

    
    
    
    
}
