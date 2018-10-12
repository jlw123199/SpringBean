package com.example.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class Home {


    @RequestMapping("/")
    public String index ( Model model )
    {
        model.addAttribute("name","jlw");
        return "index";
    }
}
