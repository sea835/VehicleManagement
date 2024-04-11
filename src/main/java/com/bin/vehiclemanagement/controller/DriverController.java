package com.bin.vehiclemanagement.controller;

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/drivers/json")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }

    @GetMapping(path = "/view")
    public List<Driver> getDriver(){return driverService.getDriver();}

    @PostMapping(path = "/create")
    public void registerNewDriver(@RequestBody Driver driver){
        driverService.addNewDriver(driver);
    }

    @DeleteMapping(path = "/driver/{driverId}")
    public void deleteDriver(@PathVariable("driverId") Integer id){
        driverService.deleteDriver(id);
    }


//    @PutMapping(path = "{driverId}")
//    public void updateStudent(
//            @PathVariable("driverId") Long studentId,
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String email
//    ){
//        studentService.updateStudent(studentId, name, email);
//    }
}
