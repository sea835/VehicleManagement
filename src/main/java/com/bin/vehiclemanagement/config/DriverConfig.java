package com.bin.vehiclemanagement.config;

import com.bin.vehiclemanagement.model.Driver;
import com.bin.vehiclemanagement.repository.DriverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Configuration
public class DriverConfig {

    // Danh sách các tỉnh ở Việt Nam
    private static final List<String> PROVINCES = Arrays.asList(
            "Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng", "Cần Thơ",
            "Bà Rịa - Vũng Tàu", "Bình Dương", "Bình Thuận", "Cà Mau", "Cao Bằng",
            "Đắk Lắk", "Đồng Nai", "Gia Lai", "Hà Giang", "Hà Nam",
            "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên"
    );

    // Danh sách các loại giấy phép
    private static final List<String> LICENSES = Arrays.asList("A", "B", "C");

    @Bean
    CommandLineRunner commandLineRunnerDriver(DriverRepository repository) {
        return args -> {
            List<String> driverNames = List.of("Ngohai", "John",
                    "Alice", "Bob", "Emma", "Michael", "Sophia", "William",
                    "Olivia", "James", "Isabella", "Daniel", "Emily", "Benjamin",
                    "Charlotte", "Jacob", "Mia", "Ethan", "Amelia", "Alexander");
            for (int i = 1; i <= 20; i++) {
                String name = driverNames.get(i % driverNames.size());
                String phoneNum = generatePhoneNumber();
                String address = PROVINCES.get(i % PROVINCES.size());
                String license = LICENSES.get(i % LICENSES.size());
                Long salary = ThreadLocalRandom.current().nextLong(10000, 50000); // Tạo lương ngẫu nhiên từ 10,000 đến 50,000
                salary = (salary / 1000) * 1000; // Làm tròn đến hàng ngàn

                Driver driver = new Driver(i, name, phoneNum, address, license, salary, null,null);
                repository.save(driver);
            }
        };
    }

    // Tạo số điện thoại ngẫu nhiên
    private String generatePhoneNumber() {
        StringBuilder builder = new StringBuilder("0");
        for (int i = 1; i <= 9; i++) {
            builder.append(ThreadLocalRandom.current().nextInt(0, 10));
        }
        return builder.toString();
    }
}
