package com.example.artifactidwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String greeting(){
        return "<h1 color:purple>Hello Queen</h1>";
    }
}
