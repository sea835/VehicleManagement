package com.bin.vehiclemanagement.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Trip {
    @Id
    @SequenceGenerator(
            name = "trip_sequence",
            sequenceName = "trip_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trip_sequence"
    )
    private Integer id;
    private Integer tripCode;
    private Integer distance;
    private Long price;
    private LocalDate startTime;
    private LocalDate endTime;
    private Boolean status;

    public Trip() {
    }

    public Trip(Integer id,
                Integer tripCode,
                Integer distance,
                Long price,
                LocalDate startTime,
                LocalDate endTime,
                Boolean status) {
        this.id = id;
        this.tripCode = tripCode;
        this.distance = distance;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
    public Trip(Integer tripCode,
                Integer distance,
                Long price,
                LocalDate startTime,
                LocalDate endTime,
                Boolean status) {
        this.tripCode = tripCode;
        this.distance = distance;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
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

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", tripCode=" + tripCode +
                ", distance=" + distance +
                ", price=" + price +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }
}
