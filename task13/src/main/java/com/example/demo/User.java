package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class User {
    @Value("${program.user.name}")
    private String name;
    @PostConstruct
    public void init() {
        System.out.println(name);
    }
}

