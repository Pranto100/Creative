/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpkg;

/**
 *
 * @author User
 */
public class FeedSupplier extends User {
    private int supplierCode;

    public FeedSupplier(int supplierCode) {
        this.supplierCode = supplierCode;
    }

    public FeedSupplier(int supplierCode, int id, int password, String type, String name, String gender, String contact, String address) {
        super(id, password, type, name, gender, contact, address);
        this.supplierCode = supplierCode;
    }

    public int getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(int supplierCode) {
        this.supplierCode = supplierCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FeedSupplier{" + "supplierCode=" + supplierCode + '}';
    }
    
    
}
