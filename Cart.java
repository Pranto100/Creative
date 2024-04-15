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
public class Cart implements Serializable {
    
    private String name, type;
    private int quantity,price;

    public Cart() {
    }

    public Cart(String name, String type, int quantity, int price) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int calculateTotalPrice(){
        return price * quantity;
    }
    @Override
    public String toString() {
        return "Cart{" + "name=" + name + ", type=" + type + ", quantity=" + quantity + ", price=" + price + '}';
    }

    

    

   

    
    
    
    
}
