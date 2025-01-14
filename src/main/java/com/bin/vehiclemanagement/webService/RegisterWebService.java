package com.bin.vehiclemanagement.webService;

import com.bin.vehiclemanagement.application.UserType;
import com.bin.vehiclemanagement.model.UserModel;
import com.bin.vehiclemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class RegisterWebService {
    private final UserRepository userRepository;

    @Autowired
    public RegisterWebService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(UserModel userModel, Model model){
        userRepository.save(userModel);
    }

    public void updateRole(UserType userType){
        userRepository.updateUserModelByUserType(userType);
    }
}
