/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpkg;

/**
 *
 * @author User
 */
public class User {
    protected int id, password ;
    protected String type,name;

    public User() {
    }
    

    public User(int id, int password, String type, String name, String gender, String contact, String address) {
        this.id = id;
        this.password = password;
        this.type = type;
        this.name = name;
      
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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", password=" + password + ", type=" + type + ", name=" + name + '}';
    }
 
    
    
    
    }

    


    

    
    

