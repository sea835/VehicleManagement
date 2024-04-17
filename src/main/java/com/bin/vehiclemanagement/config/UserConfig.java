package com.bin.vehiclemanagement.config;

import com.bin.vehiclemanagement.model.UserModel;
import com.bin.vehiclemanagement.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.bin.vehiclemanagement.application.UserType.admin;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            UserModel userModel = new UserModel(
                    "hai.ngo1902",
                    "haihaihai",
                    admin,
                    "0268840424"
            );
            userRepository.save(userModel);
        };
    }
}
