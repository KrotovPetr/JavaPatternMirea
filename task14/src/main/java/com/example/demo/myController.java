package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class myController {

    @GetMapping
    public String Group(){
        Group gr =  new Group("IkBO-01-20");
        return gr.name();
    }


}
