package com.bin.vehiclemanagement.model;

import com.bin.vehiclemanagement.application.Location;
import jakarta.persistence.*;

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
    private Location pickLocation;
    private Location endLocation;

    public Booking(Integer id,
                   Integer tripCode,
                   Integer driverId,
                   Integer vehicleId,
                   Integer performance,
                   Long income) {
        this.id = id;
        this.tripCode = tripCode;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.performance = performance  ;
        this.income = income;
    }

    public Booking() {
    }

    public Booking(Integer id,
                   Integer tripCode,
                   Integer driverId,
                   Integer vehicleId,
                   Integer performance,
                   Long income,
                   String customerPhoneNum) {
        this.id = id;
        this.tripCode = tripCode;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.performance = performance;
        this.income = income;
        this.customerPhoneNum = customerPhoneNum;
    }

    public Booking(Integer tripCode,
                   Integer driverId,
                   Integer vehicleId,
                   Integer performance,
                   Long income,
                   String customerPhoneNum,
                   Location pickLocation,
                   Location endLocation) {
        this.tripCode = tripCode;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.performance = performance;
        this.income = income;
        this.customerPhoneNum = customerPhoneNum;
        this.pickLocation = pickLocation;
        this.endLocation = endLocation;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

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
                ", pickLocation=" + pickLocation +
                '}';
    }
}
