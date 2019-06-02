package com.onlinetutorialspoint.conroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    @CrossOrigin(origins = "*")
    public String greet(){
        return "Hello From Spring CORS  Resource";
    }
}
