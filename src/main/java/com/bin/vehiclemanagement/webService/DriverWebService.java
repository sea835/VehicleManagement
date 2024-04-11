package com.bin.vehiclemanagement.webService;

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


import java.util.Optional;

@Service
public class DriverWebService {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverWebService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public String showDriver(Integer id, Model model) {

        Optional<Driver> driverOptional = driverRepository.findById(id);

        if (driverOptional.isPresent()) {
            Driver driver = driverOptional.get();
            model.addAttribute("driver", driver);
            return "driver";
        } else {
            // Handle case when driver with given ID is not found
            return "error"; // Redirect to an error page or handle appropriately
        }
    }

    public String createDriver(){
        return "driverCreate";
    }

    public void createDriver(Driver driver, Model model){
        //System.out.println(driver.toString());
        driverRepository.save(driver);
        //return "driverCreate";
    }
    public void deleteDriver(Integer driverId){
//        boolean exist =driverRepository.existsById(driverId);
//        if(!exist){
//            throw new IllegalStateException("Student with "+ studentId +" not exist");
//        }
        driverRepository.deleteById(driverId);
    }
}
