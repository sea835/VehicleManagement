package com.bin.vehiclemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    private Integer id;
    private String customerPhoneNum;
    private String customerName;
    public Integer getID(){return this.id;}
    public void setID(Integer id){ this.id = id;}
    public String getCusTomerPhoneNum(){return this.customerPhoneNum;}
    public void setCusTomerPhoneNum(String phone){
        this.customerPhoneNum = phone ;
    }
    public String getCustomerName(){return this.customerName;}
    public void setCustomerName(String name ){
        this.customerName = name;
    }


}
