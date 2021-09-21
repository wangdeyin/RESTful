package com.example.restservice.controller;

import com.example.restservice.entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
@RequestMapping("/jquery")
public class JqueryController implements WebMvcConfigurer {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
