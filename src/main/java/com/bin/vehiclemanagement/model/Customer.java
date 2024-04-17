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

}
