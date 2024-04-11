package com.bin.vehiclemanagement.config;

import com.bin.vehiclemanagement.model.Trip;
import com.bin.vehiclemanagement.repository.TripRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
@Configuration
public class TripConfig {
    @Bean
    CommandLineRunner commandLineRunnerTrip(TripRepository repository){
        return args -> {
            Trip test = new Trip(
                    2,
                    234,
                    34,
                    234000L,
                    LocalDate.of(2024,4,1),
                    LocalDate.now(),
                    true
            );

            repository.saveAll(
                    List.of(test)
            );
        };
    }
}
