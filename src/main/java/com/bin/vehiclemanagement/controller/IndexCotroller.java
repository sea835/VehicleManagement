package com.bin.vehiclemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexCotroller {

    @GetMapping("/home")
    public String index(){
        return "index";
    }
}
