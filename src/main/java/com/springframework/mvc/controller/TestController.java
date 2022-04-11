package com.springframework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/root")
public class TestController {

    @GetMapping
    public String testControler(){
        System.out.println("Hello world!!!");
        return "test";
    }
}
