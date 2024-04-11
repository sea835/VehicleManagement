package com.bin.vehiclemanagement.config;

import com.bin.vehiclemanagement.model.Vehicle;
import com.bin.vehiclemanagement.repository.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import java.time.LocalDate;

@Configuration
public class VehiceConfig {
    @Bean
    CommandLineRunner commandLineRunnerVehicle(VehicleRepository repository){
        return args -> {
            Vehicle vehicle1 = new Vehicle(
                    1,
                    "xang",
                    45,
                    1000,
                    LocalDate.now(),
                    false,
                    100
            );
            repository.saveAll(
                    List.of(vehicle1)
            );
        };
    }
}
