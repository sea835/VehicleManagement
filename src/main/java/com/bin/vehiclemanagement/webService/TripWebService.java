package com.bin.vehiclemanagement.webService;


import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class TripWebService {
    private  final TripRepository tripRepository;
    @Autowired
    public TripWebService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public String showTrip(Integer id, Model model) {

        Optional<Trip> tripOptional = tripRepository.findById(id);

        if (tripOptional.isPresent()) {
            Trip trip = tripOptional.get();
            model.addAttribute("Trip", trip);
            return "Trip";
        } else {
            // Handle case when driver with given ID is not found
            return "error"; // Redirect to an error page or handle appropriately
        }
    }
    public void createTrip(Trip trip, Model model){
        tripRepository.save(trip);
    }
}
