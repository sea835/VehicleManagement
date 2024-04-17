package com.bin.vehiclemanagement.service;

import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> getTrip() {
        return tripRepository.findAll();
    }

    public void addNewTrip(Trip trip) {
//        Optional<Driver> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
//        if(studentByEmail.isPresent()){
//            throw new IllegalStateException("Email taken");
//        }
        tripRepository.save(trip);
    }
    public void deleteTrip(Integer tripId){
//        boolean exist =driverRepository.existsById(driverId);
//        if(!exist){
//            throw new IllegalStateException("Student with "+ studentId +" not exist");
//        }
        tripRepository.deleteById(tripId);
    }
}
