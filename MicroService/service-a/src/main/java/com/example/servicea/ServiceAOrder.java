package com.example.servicea;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ServiceAOrder {

    @GetMapping("/list")
    public String List(){
        return "order1";
    }



}
