package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.application.UserType;
import com.bin.vehiclemanagement.model.UserModel;
import com.bin.vehiclemanagement.webService.RegisterWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "register")
public class RegisterWebController {
    private final RegisterWebService registerWebService;

    @Autowired
    public RegisterWebController(RegisterWebService registerWebService){
        this.registerWebService = registerWebService;
    }

    @GetMapping
    public String showRegister(){
        return "register";
    }

    @PostMapping
    public String saveRegister(@ModelAttribute UserModel userModel, Model model){
        System.out.println(userModel.toString());
        registerWebService.createUser(userModel, model);
        return "chooseRole";
    }

    @PutMapping("update")
    public String chanceRole(@ModelAttribute UserType userType){
        if(userType == UserType.driver){
            registerWebService.updateRole(userType);
            return "driverRegisterForm";
        }else{
            return "login";
        }
    }
}
