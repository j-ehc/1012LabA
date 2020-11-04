package com.wozu.deployment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/hello")
public class HelloController {

    @GetMapping ("/get")
    public String getHello(){
        return "Heya!";
    }
}
