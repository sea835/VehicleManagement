package com.bin.vehiclemanagement.model;

import com.bin.vehiclemanagement.application.Location;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Booking {
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
    private Integer id;
    private Integer tripCode;
    private Integer driverId;
    private Integer vehicleId;
    private Integer performance;
    private Long income;
    private String customerPhoneNum;
    private String itemName;
    private Integer weight;
    private String customerName;
    private Location pickLocation;
    private Location endLocation;
    private LocalDate date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTripCode() {
        return tripCode;
    }

    public void setTripCode(Integer tripCode) {
        this.tripCode = tripCode;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Location getPickLocation() {
        return pickLocation;
    }

    public void setPickLocation(Location pickLocation) {
        this.pickLocation = pickLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Booking(Integer id, Integer tripCode, Integer driverId, Integer vehicleId, Integer performance, Long income, String customerPhoneNum, String itemName, Integer weight, String customerName, Location pickLocation, Location endLocation, LocalDate date) {
        this.id = id;
        this.tripCode = tripCode;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.performance = performance;
        this.income = income;
        this.customerPhoneNum = customerPhoneNum;
        this.itemName = itemName;
        this.weight = weight;
        this.customerName = customerName;
        this.pickLocation = pickLocation;
        this.endLocation = endLocation;
        this.date = date;
    }

    public Booking() {
    }

    public Booking(Integer tripCode, Integer driverId, Integer vehicleId, Integer performance, Long income, String customerPhoneNum, Location pickLocation, Location endLocation) {
        this.tripCode = tripCode;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.performance = performance;
        this.income = income;
        this.customerPhoneNum = customerPhoneNum;
        this.pickLocation = pickLocation;
        this.endLocation = endLocation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", tripCode=" + tripCode +
                ", driverId=" + driverId +
                ", vehicleId=" + vehicleId +
                ", performance=" + performance +
                ", income=" + income +
                ", customerPhoneNum='" + customerPhoneNum + '\'' +
                ", itemName='" + itemName + '\'' +
                ", weight=" + weight +
                ", customerName='" + customerName + '\'' +
                ", pickLocation=" + pickLocation +
                ", endLocation=" + endLocation +
                ", date=" + date +
                '}';
    }
}
