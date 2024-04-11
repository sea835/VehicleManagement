package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.webService.VehicleWebService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Vehicle/api")
public class VehicleWebController {
    private final VehicleWebService vehicleWebService;

    public VehicleWebController(VehicleWebService vehicleWebService) {
        this.vehicleWebService = vehicleWebService;
    }

    @GetMapping(path = "/vehicle/{vehicleId}/show")
    public String showVehicle(@PathVariable("vehicleId") Integer id, Model model){
        return vehicleWebService.showVehicle(id, model);
    }

    @GetMapping(path = "/create")
    public String createVehicle(@ModelAttribute Vehicle vehicle, Model model){
        vehicleWebService.createVehicle(vehicle, model);
        return "redirect:/drivers/api/driver/" + vehicle.getId() + "/show";
    }
}
