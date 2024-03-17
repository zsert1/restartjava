package com.main.start.controller;

import com.main.start.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

   final HelloService helloService;

    public  HelloController(HelloService helloService){
        this.helloService=helloService;
    }
 @GetMapping("/hello")
    public  String hello(){
      return   helloService.printHello();
    }
}
