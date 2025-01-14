package com.bin.vehiclemanagement.webService;

import com.bin.vehiclemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginWebService {
    private final UserRepository userRepository;

    @Autowired
    public LoginWebService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String login(String userName, String password){
        if(userRepository.findUserModelByUsernameAndPassword(userName, password).isPresent()){
            System.out.println("LOGINED");
            return "index";
        }else{
            System.out.println("ACCOUNT NOT FOUND");
            return "login";
        }
    }
}
