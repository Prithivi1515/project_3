package com.example.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Objects;
import com.example.dev.domain.User;
import com.example.dev.service.LogService;
import com.example.dev.service.RegService;

@Controller
public class LogController {
 
    @Autowired
    private LogService service;
    @Autowired
    private RegService service2;
 
    @GetMapping("/log")
    public String api()
    {
        return "log";
    }
 
    @PostMapping("/log")
    public String login(@ModelAttribute("user") User user) {
 
        User oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }

    @GetMapping("/register")
    public String api2()
    {
        return "register";
    }
 
    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user) {
 
        User oauthUser = service2.reg(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/log";
        } else {
            return "redirect:/";
        }
    }
}