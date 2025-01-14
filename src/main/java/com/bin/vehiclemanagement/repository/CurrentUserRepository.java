package com.bin.vehiclemanagement.repository;

import com.bin.vehiclemanagement.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentUser extends JpaRepository<UserModel, Integer> {
}
