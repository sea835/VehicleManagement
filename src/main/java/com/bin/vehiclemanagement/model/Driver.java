package com.bin.vehiclemanagement.model;

import com.bin.vehiclemanagement.application.Location;
import jakarta.persistence.*;

@Entity
@Table
public class Driver {
    @Id
    @SequenceGenerator(
            name = "driver_sequence",
            sequenceName = "driver_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "driver_sequence"
    )
    private int id;
    private String name;
    private String phoneNum;
    private String address;
    private String license;

    //-------------------------------------------
    private Long salary;
    private String history;
    private Location location;
    private Boolean busy = false;

    public Driver() {
    }

    public Driver(int id,
                  String name,
                  String phoneNum,
                  String address,
                  String license,
                  Long salary,
                  String history) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.license = license;
        this.salary = salary;
        this.history = history;
    }

    public Driver(String name,
                  String phoneNum,
                  String address,
                  String license,
                  Long salary) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.license = license;
        this.salary = salary;
    }

    public Driver(int id,
                  String name,
                  String phoneNum,
                  String address,
                  String license,
                  Long salary) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.license = license;
        this.salary = salary;
    }

    public Driver(int id,
                  String name,
                  String phoneNum,
                  String address,
                  String license,
                  Long salary,
                  String history,
                  Location location) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.license = license;
        this.salary = salary;
        this.history = history;
        this.location = location;
    }

    public Driver(String name, String phoneNum, String address, String license) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.license = license;
    }

    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", license='" + license + '\'' +
                ", salary=" + salary +
                ", history='" + history + '\'' +
                ", location=" + location +
                ", busy=" + busy +
                '}';
    }
}
