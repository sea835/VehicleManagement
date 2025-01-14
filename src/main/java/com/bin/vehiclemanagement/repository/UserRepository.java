package com.bin.vehiclemanagement.repository;

import com.bin.vehiclemanagement.application.UserType;
import com.bin.vehiclemanagement.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    @Query("SELECT u FROM UserModel u WHERE u.username=?1 AND u.password=?2")
    Optional<UserModel> findUserModelByUsernameAndPassword(String username, String password);

    @Query("UPDATE UserModel u SET u.userType=?1 WHERE u.id=(SELECT MAX(u.id) FROM UserModel )")
    void updateUserModelByUserType(UserType userType);

}
