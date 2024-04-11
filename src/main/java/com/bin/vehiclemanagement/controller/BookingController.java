package com.bin.vehiclemanagement.controller;

//TODO: booking controller

import com.bin.vehiclemanagement.application.BookingApplication;
import com.bin.vehiclemanagement.model.Booking;
import com.bin.vehiclemanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking/json")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }
    @GetMapping(path = "/view")
    public List<Booking> getBooking(){
        return bookingService.getBooking();
    }

    @PostMapping(path = "/create")
    public void registerNewDriver(@RequestBody Booking booking){
        bookingService.addNewBooking(booking);
    }
}
