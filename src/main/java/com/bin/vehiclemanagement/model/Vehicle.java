package com.bin.vehiclemanagement.model;

import com.bin.vehiclemanagement.application.VehicleType;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
@Entity
@Table
public class Vehicle {
    @Id
    @SequenceGenerator(
            name = "vehicle_sequence",
            sequenceName = "vehicle_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicle_sequence"
    )
    private Integer id;
    private String fuel;
    private Integer fuelRatio;
    private Integer weight;
    private LocalDate dayMaintenance;
    private Boolean busy = false;
    private Integer performance;
    private VehicleType vehicleType;

    public Vehicle() {
    }

    public Vehicle(Integer id,
                   String fuel,
                   Integer fuelRatio,
                   Integer weight,
                   LocalDate dayMaintenance,
                   Boolean busy,
                   Integer performance) {
        this.id = id;
        this.fuel = fuel;
        this.fuelRatio = fuelRatio;
        this.weight = weight;
        this.dayMaintenance = dayMaintenance;
        this.busy = busy;
        this.performance = performance;
    }
    public Vehicle(String fuel,
                   Integer fuelRatio,
                   Integer weight,
                   LocalDate dayMaintenance,
                   Boolean busy,
                   Integer performance) {
        this.fuel = fuel;
        this.fuelRatio = fuelRatio;
        this.weight = weight;
        this.dayMaintenance = dayMaintenance;
        this.busy = busy;
        this.performance = performance;
    }

    public Vehicle(Integer id,
                   String fuel,
                   Integer fuelRatio,
                   Integer weight,
                   LocalDate dayMaintenance,
                   Boolean busy,
                   Integer performance,
                   VehicleType vehicleType) {
        this.id = id;
        this.fuel = fuel;
        this.fuelRatio = fuelRatio;
        this.weight = weight;
        this.dayMaintenance = dayMaintenance;
        this.busy = busy;
        this.performance = performance;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getFuelRatio() {
        return fuelRatio;
    }

    public void setFuelRatio(Integer fuelRatio) {
        this.fuelRatio = fuelRatio;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LocalDate getDayMaintenance() {
        return dayMaintenance;
    }

    public void setDayMaintenance(LocalDate dayMaintenance) {
        this.dayMaintenance = dayMaintenance;
    }

    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", fuel='" + fuel + '\'' +
                ", fuelRatio=" + fuelRatio +
                ", weight=" + weight +
                ", dayMaintenance=" + dayMaintenance +
                ", busy=" + busy +
                ", performance=" + performance +
                '}';
    }
}
