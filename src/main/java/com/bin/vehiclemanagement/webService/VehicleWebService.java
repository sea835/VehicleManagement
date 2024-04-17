package com.bin.vehiclemanagement.webService;

import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.repository.TripRepository;
import com.bin.vehiclemanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class VehicleWebService {
    private  final VehicleRepository vehicleRepository;
    @Autowired
    public VehicleWebService( VehicleRepository vehicleRepository)
    {
        this.vehicleRepository = vehicleRepository;
    }

    public String showVehicle(Integer id, Model model) {

        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(id);

        if (vehicleOptional.isPresent()) {
            Vehicle vehicle = vehicleOptional.get();
            model.addAttribute("Vehicle", vehicle);
            return "Vehicle";
        } else {
            // Handle case when driver with given ID is not found
            return "error"; // Redirect to an error page or handle appropriately
        }
    }
    public void createVehicle(Vehicle vehicle, Model model){
        vehicleRepository.save(vehicle);
    }
}

