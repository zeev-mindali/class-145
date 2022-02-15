package com.jb.spring_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {
    @GetMapping("login")
    public String getLoginView(){
        return "login"; //same name as template
    }

    @GetMapping("mainpage")
    public String getMainPage(){
        return "mainpage";
    }
}
