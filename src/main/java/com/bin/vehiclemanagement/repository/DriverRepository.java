package com.bin.vehiclemanagement.repository;

import com.bin.vehiclemanagement.application.Location;
import com.bin.vehiclemanagement.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    @Query("SELECT d FROM Driver d WHERE d.location = ?1 AND d.license = ?2 AND d.busy=false ORDER BY d.salary")
    public Optional<Driver>findByLocationAndLicense(Location location, String license);
}
