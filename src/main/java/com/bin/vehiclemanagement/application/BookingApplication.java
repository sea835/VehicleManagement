package com.bin.vehiclemanagement.application;

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.repository.DriverRepository;
import com.bin.vehiclemanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//TODO: booking application
@Service
public class BookingApplication {
    private final DriverRepository driverRepository;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public BookingApplication(DriverRepository driverRepository,
                              VehicleRepository vehicleRepository){
        this.driverRepository = driverRepository;
        this.vehicleRepository = vehicleRepository;
    }

    //TODO: kiểm tra xem driver lấy ra có lỗi hay ko
    public Integer findDriverIdByLocationAndLicense(Location location,String license){
        if(driverRepository.findByLocationAndLicense(location, license).isPresent()) {
            Driver driver = driverRepository.findByLocationAndLicense(location, license).get();
            return driver.getId();
        }else {
            throw new IllegalStateException("No driver near here");
        }
    }

    public Integer findVehicleIdByType(VehicleType vehicleType){
        if(vehicleRepository.findByVehicleType(vehicleType).isPresent()){
            Vehicle vehicle = vehicleRepository.findByVehicleType(vehicleType).get();
            return vehicle.getId();
        }else{
            throw new IllegalStateException("No "+vehicleType+" ready");
        }
    }
}
