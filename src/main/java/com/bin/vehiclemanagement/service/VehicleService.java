package com.bin.vehiclemanagement.service;


import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository){this.vehicleRepository = vehicleRepository;}

    public List<Vehicle>getVehicle(){return vehicleRepository.findAll();}

    public void addNewVehicle(Vehicle vehicle){
//        Optional<Vehicle> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
//        if(studentByEmail.isPresent()){
//            throw new IllegalStateException("Email taken");
//        }
        vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Integer vehicleId){
//        boolean exist =driverRepository.existsById(driverId);
//        if(!exist){
//            throw new IllegalStateException("Student with "+ studentId +" not exist");
//        }
        vehicleRepository.deleteById(vehicleId);
    }

}
