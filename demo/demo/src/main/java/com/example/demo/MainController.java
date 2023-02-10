package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{
    @RequestMapping("/webdic")
    public String index() {
        return "webdic에 오신것을 환영합니다.";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/")
    public String root(){
        return "redirect:/home";
    }
}