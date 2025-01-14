package com.bin.vehiclemanagement.service;

import com.bin.vehiclemanagement.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import com.bin.vehiclemanagement.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }
    public List<Driver> getDriver(){
        return driverRepository.findAll();
    }

    public void addNewDriver(Driver driver){
//        Optional<Driver> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
//        if(studentByEmail.isPresent()){
//            throw new IllegalStateException("Email taken");
//        }
        driverRepository.save(driver);
    }

    public void deleteDriver(Integer driverId){
//        boolean exist =driverRepository.existsById(driverId);
//        if(!exist){
//            throw new IllegalStateException("Student with "+ studentId +" not exist");
//        }
        driverRepository.deleteById(driverId);
    }

//    @Transactional
//    public void updateStudent(Long studentId, String name, String email){
//        Student student = studentRepository.findById(studentId).orElseThrow(
//                () -> new IllegalStateException("Student with "+ studentId +" not exist")
//        );
//        if(name != null &&
//                name.length() >0 &&
//                !Objects.equals(student.getName(), name)){
//            student.setName(name);
//        }
//
//        if(email != null &&
//                email.length()>0 &&
//                !Objects.equals(student.getEmail(), email)){
//            student.setEmail(email);
//        }
//    }
}
