/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpkg;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class InventoryManager extends Employee {
    private int membershipId;

    public InventoryManager(int membershipId) {
        this.membershipId = membershipId;
    }

    public InventoryManager(int membershipId, int id, int password, String type, String name, String gender, String contact, String address) {
        super(id, password, type, name, gender, contact, address);
        this.membershipId = membershipId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
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
        return "InventoryManager{" + "membershipId=" + membershipId + '}';
    }
    
    
}
