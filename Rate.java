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
public class Rate {
    private int membership;
    private String customerName;
    private int rate;
    LocalDate rateDate;

    public Rate(int membership, String customerName, int rate, LocalDate rateDate) {
        this.membership = membership;
        this.customerName = customerName;
        this.rate = rate;
        this.rateDate = rateDate;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LocalDate getRateDate() {
        return rateDate;
    }

    public void setRateDate(LocalDate rateDate) {
        this.rateDate = rateDate;
    }

    @Override
    public String toString() {
        return "Rate{" + "membership=" + membership + ", customerName=" + customerName + ", rate=" + rate + ", rateDate=" + rateDate + '}';
    }
    
    
}
