package com.bin.vehiclemanagement.controller;

import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path ="/trips/json")
public class TripController {
    private final TripService tripService;

    @Autowired
    public TripController(TripService tripService){this.tripService = tripService;}

    @GetMapping(path = "/view")
    public List<Trip> getTrip(){return tripService.getTrip();}

    @PostMapping(path = "/create")
    public void registerNewTrip(@RequestBody Trip trip){
        tripService.addNewTrip(trip);
    }

    @DeleteMapping(path = "/trip/{tripId}")
    public void deleteTrip(@PathVariable("tripId") Integer id){tripService.deleteTrip(id);}
}
