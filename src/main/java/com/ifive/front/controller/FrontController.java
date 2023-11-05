package com.ifive.front.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;

import org.springframework.ui.Model;



@Controller
public class FrontController {
    private final Logger log = LoggerFactory.getLogger(FrontController.class);
    
    @GetMapping("/home")
    public String drawHome(Model model) {
        log.info("log message : {} start","home");

    

        return "basic/home";
    }
}
