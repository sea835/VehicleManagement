package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.model.Booking;
import com.bin.vehiclemanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/booking")
public class BookingWebController {

    private final BookingService bookingService;

    @Autowired
    public BookingWebController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping(path = "/create")
    public String createExpress(){
        return "expressBooking";
    }

    @PostMapping(path = "/create")
    public String saveExpress(@ModelAttribute Booking booking, Model model){
        bookingService.addNewBooking(booking);
        System.out.println(booking.toString());
        return "expressBooking";
    }
}
