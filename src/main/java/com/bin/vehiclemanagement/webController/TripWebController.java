package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.webService.TripWebService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/Trip/api")
public class TripWebController {
    private  final TripWebService tripWebService;

    public  TripWebController(TripWebService tripWebService){
        this.tripWebService =tripWebService;
    }
    @GetMapping(path = "/Trip/{TripId}/show")
    public String showTrip (@PathVariable("driverId") Integer id , Model model) {
        return this.tripWebService.showTrip(id,model);
    }
    @PostMapping(path = "/Trip/create")
    public String createTrip(@ModelAttribute Trip trip, Model model){
        //System.out.println(driver.toString());
        tripWebService.createTrip(trip, model);
        return "redirect:/drivers/api/Trip/" + trip.getId() + "/show";
    }
}