package com.bin.vehiclemanagement.webController;

import com.bin.vehiclemanagement.model.UserModel;
import com.bin.vehiclemanagement.webService.LoginWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "login")
public class LoginWebController {

    private final LoginWebService loginWebService;

    @Autowired
    public LoginWebController(LoginWebService loginWebService){
        this.loginWebService = loginWebService;
    }

    @GetMapping
    public String showLogin(){
        return "login";
    }

    @PostMapping
    public String checkAccount(@ModelAttribute UserModel userModel, Model model){
        return loginWebService.login(userModel.getUsername(), userModel.getPassword());
    }
}
