package com.poc.java8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloService")
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello from SpringBoot with IBM Java8";
    }
    @GetMapping("/sayHello/{name}")
    public String sayHelloName(@PathVariable String name){
        //http://localhost:8081/helloService/sayHello/Venkat
        return "Hello "+name+" from SpringBoot with IBM Java8";
    }
}
