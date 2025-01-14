package com.bin.vehiclemanagement.service;

//TODO: Booking Service

import com.bin.vehiclemanagement.application.BookingApplication;
import com.bin.vehiclemanagement.application.Location;
import com.bin.vehiclemanagement.application.VehicleType;
import com.bin.vehiclemanagement.model.Booking;
import com.bin.vehiclemanagement.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    private final BookingApplication bookingApplication;

    @Autowired
    public BookingService(BookingRepository bookingRepository,
                          BookingApplication bookingApplication){
        this.bookingRepository = bookingRepository;
        this.bookingApplication = bookingApplication;
    }
    public List<Booking> getBooking(){
        return bookingRepository.findAll();
    }

    public void addNewBooking(Booking booking){
        bookingRepository.save(booking);
    }

    public Booking generateBooking(Location location,
                                   String license,
                                   VehicleType vehicleType,
                                   Integer tripCode,
                                   String customerPhoneNum,
                                   Location endLocation){
        Integer driverId = bookingApplication.findDriverIdByLocationAndLicense(location, license);
        Integer vehicleId = bookingApplication.findVehicleIdByType(vehicleType);
        Long income = 0L;
        Booking booking = new
                Booking(tripCode,
                driverId,
                vehicleId,
                100,
                income,
                customerPhoneNum,
                location,
                endLocation);
        return booking;
    }
}
