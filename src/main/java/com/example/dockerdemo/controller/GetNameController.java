package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetNameController {

    @GetMapping("/testApi")
    public String getName() {
        return "Service is up & running !!!";
    }

    @GetMapping("/getRequestedName")
    public String getReqName(@RequestParam String name) {
        return "My name is: "+name;
    }
}
