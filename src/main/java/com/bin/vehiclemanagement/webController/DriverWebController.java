package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.webService.DriverWebService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/drivers/api")
public class DriverWebController {

    private final DriverWebService driverWebService;

    public DriverWebController(DriverWebService driverWebService){
        this.driverWebService = driverWebService;
    }

    @GetMapping(path = "/driver/{driverId}/show")
    public String showDriver(@PathVariable("driverId") Integer id, Model model){
        return driverWebService.showDriver(id, model);
    }

    @GetMapping(path = "/create")
    public String createDriver(){
        return driverWebService.createDriver();
    }

    @PostMapping(path = "/create")
    public String createDriver(@ModelAttribute Driver driver, Model model){
        //System.out.println(driver.toString());
        driverWebService.createDriver(driver, model);
        return "redirect:/drivers/api/driver/" + driver.getId() + "/show";
    }

    @DeleteMapping(path = "/driver/{driverId}/delete")
    public void deleteDriver(@PathVariable("driverId") Integer id){
        driverWebService.deleteDriver(id);
    }
}
