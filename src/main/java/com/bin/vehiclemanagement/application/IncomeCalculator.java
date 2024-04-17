package com.bin.vehiclemanagement.application;
//TODO: income caculato: income = TripPrice - distance*fuelRatio - salary

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.repository.DriverRepository;
import com.bin.vehiclemanagement.repository.TripRepository;
import com.bin.vehiclemanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.Math.*;

@Service
public class IncomeCalculator {
    private final TripRepository tripRepository;
    private final DriverRepository driverRepository;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public IncomeCalculator(TripRepository tripRepository,
                            DriverRepository driverRepository,
                            VehicleRepository vehicleRepository){
        this.tripRepository = tripRepository;
        this.driverRepository = driverRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Long calculator(Integer tripId,
                           Integer vehicleId,
                           Integer driverId){

        Optional<Trip> tripOptional = tripRepository.findById(tripId);
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicleId);
        Optional<Driver> driverOptional = driverRepository.findById(driverId);

        Long tripPrice = 0L;
        Integer distance = 0;
        Integer fuelRatio = 0;
        Long salary = 0L;

        if(tripOptional.isPresent() && vehicleOptional.isPresent() && driverOptional.isPresent()){
            tripPrice = tripOptional.get().getPrice();
            distance = tripOptional.get().getDistance();
            fuelRatio = vehicleOptional.get().getFuelRatio();
            salary = driverOptional.get().getSalary();
            return (tripPrice - distance*fuelRatio - salary);
        }else {
            throw new IllegalStateException("error");
        }
    }
}
