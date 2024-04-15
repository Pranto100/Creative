/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpkg;

/**
 *
 * @author User
 */
public class Warehouse {
     private int goodNo,quantity;
     private String goodName, type;
     private float price;

    public Warehouse(int goodNo, int quantity, String goodName, String type, float price) {
        this.goodNo = goodNo;
        this.quantity = quantity;
        this.goodName = goodName;
        this.type = type;
        this.price = price;
    }

    public int getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(int goodNo) {
        this.goodNo = goodNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "goodNo=" + goodNo + ", quantity=" + quantity + ", goodName=" + goodName + ", type=" + type + ", price=" + price + '}';
    }
     
     
     
    
}
