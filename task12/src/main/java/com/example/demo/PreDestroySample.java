package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

@Component
public class PreDestroySample {
    @PreDestroy
    public void init() {
        File file1 = new File("C:\\Users\\Peter\\Downloads\\myData\\hello.txt");
       // file1.delete();
        if (file1.exists()){
            System.out.println("Файл существует!");
        }
        else{
            System.out.println("Файл удалён!");
        }
    }
}