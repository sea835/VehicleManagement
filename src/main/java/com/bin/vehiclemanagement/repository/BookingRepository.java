package com.bin.vehiclemanagement.repository;

import com.bin.vehiclemanagement.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
//    @Query()
//    Optional<Booking> findBy(Integer integer);
}
