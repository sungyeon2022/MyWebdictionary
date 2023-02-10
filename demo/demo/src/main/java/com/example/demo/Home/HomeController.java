package com.example.demo.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;


@RequestMapping("/home")
@RequiredArgsConstructor
@Controller
public class HomeController {

    @RequestMapping("/whoami")
    public String whoami(){
        return "home_whoami";
    }

    @RequestMapping("/sidebar")
    public String sidebar(){
        return "sidebar";
    }
}
