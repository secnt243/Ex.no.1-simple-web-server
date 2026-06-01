package com.example.demodependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
//    @Autowired
//    private Service service;

    private Service service;
//   public  Controller(Service service)
//   {
//       this.service=service;
//   }
    @Autowired
    public void Setterinju(Service service)
    {
        this.service=service;
    }
    @GetMapping("/")
    public String demo()
    {
        return service.getmessge();
    }


}
