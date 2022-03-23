package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.io.InputStream;
import java.util.Scanner;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping(value = "/home")
    public String welcome() {
        return "index.html";
    }
}