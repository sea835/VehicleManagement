package com.bin.vehiclemanagement.controller;

import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vehicles/json")
public class VehicleController {
   private final VehicleService vehicleService;

   @Autowired
   public VehicleController(VehicleService vehicleService){
      this.vehicleService = vehicleService;
   }

   @GetMapping(path = "/view")
   public List<Vehicle> getVehicle(){return vehicleService.getVehicle();}

   @PostMapping(path="/create")
   public void registerNewVehicle(@RequestBody Vehicle vehicle){
      vehicleService.addNewVehicle(vehicle);
   }

   @DeleteMapping(path = "/vehicle/{vehicleId}")
   public void deleteVehicle(@PathVariable("vehicleId") Integer id){ vehicleService.deleteVehicle(id);}
}
