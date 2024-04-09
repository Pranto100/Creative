/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;


public class Delivery_Manager extends User {

    protected int id;
    public String name;
    protected int deliveryNo;

    public Delivery_Manager() {
    }
    public Delivery_Manager(int id, String name, int deliveryNo) {
        this.id = id;
        this.name = name;
        this.deliveryNo = deliveryNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(int deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Override
    public String toString() {
        return "Delivery_Manager{" + "id=" + id + ", name=" + name + ", deliveryNo=" + deliveryNo + '}';
    }


}
