package com.example47584.demo68;


import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gift {

    @Id
    int customerid;
    String customername;
    String customeraddress;
    int customerno;
    String occassion;
    public Gift()
    {
        
    }
    public Gift(int customerid, String customername, String customeraddress, int customerno, String occassion) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.customerno = customerno;
        this.occassion = occassion;
    }
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getCustomerno() {
        return customerno;
    }

    public void setCustomerno(int customerno) {
        this.customerno = customerno;
    }

    public String getOccassion() {
        return occassion;
    }

    public void setOccassion(String occassion) {
        this.occassion = occassion;
    }

    

   
}
