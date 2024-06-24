package com.ohgiraffers.samsam.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainController {

    @GetMapping(value={"/", "/main"})
    public String dfaultLocation(){
        return "main/main";
    }
}