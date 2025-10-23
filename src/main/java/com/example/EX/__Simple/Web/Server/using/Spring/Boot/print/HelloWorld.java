package com.example.EX.__Simple.Web.Server.using.Spring.Boot.print;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/print")
    public String helloworld() {
        return "hello world";
    }

}
