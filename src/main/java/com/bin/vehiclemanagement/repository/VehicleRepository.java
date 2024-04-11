package com.bin.vehiclemanagement.repository;

import com.bin.vehiclemanagement.application.VehicleType;
import com.bin.vehiclemanagement.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query("SELECT v FROM Vehicle v WHERE v.vehicleType=?1 AND v.busy=false ORDER BY v.performance DESC")
    public Optional<Vehicle> findByVehicleType(VehicleType vehicleType);

}
