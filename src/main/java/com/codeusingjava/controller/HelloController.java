package com.codeusingjava.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getEmployees() {
        return "Hello World!";
    }
    

    @RequestMapping(value = "/helloa", method = RequestMethod.GET)
    public String gethello() {
        return "Hello World!";
    }
}