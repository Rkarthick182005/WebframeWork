package com.project10.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/welcome")
public class Democontroller {
    @GetMapping("/welcome")
      public String getMethodName()
      {
        return "Welcome Spring Boot!";
        
}
}