package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;
//C:\Users\Peter>curl -i -X POST -H "Content-Type: application/json" -d '{"name": "Peter", "surName": "Krotov", "middleName": "Andreevich" }' http://127.0.0.1:8080/infoGroup
//curl -X POST \
//        http://localhost:8080/api/users \
//        -H 'accept: application/xml' \
//        -H 'cache-control: no-cache' \
//        -H 'content-type: application/json' \
//        -d '{
//        "firstName":"Sergey",
//        "lastName":"Kargopolov",
//        "email":"test9@test.com",
//        "password":"123"
//        }'
// curl -i -X POST -H "Content-Type: application/json" -d '{"name":"Peter","surName":"Krotov","middleName":"Andreevich"}' http://localhost:8080/infoGroup

//C:\Users\Peter>curl -i -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"Peter\",\"middleName\":\"Krotov\",\"lastName\":\"Andreevich\"}" http://localhost:8080/infoGroup
//        HTTP/1.1 200
//        Content-Length: 0
//        Date: Wed, 23 Mar 2022 06:55:33 GMT
//
//
//        C:\Users\Peter>curl -i -X GET -H "Content-Type: application/json" -d "{\"firstName\":\"Peter\",\"middleName\":\"Krotov\",\"lastName\":\"Andreevich\"}" http://localhost:8080/infoGroup
//        HTTP/1.1 200
//        Content-Type: text/plain;charset=UTF-8
//        Content-Length: 23
//        Date: Wed, 23 Mar 2022 06:58:28 GMT
//
//        Peter Andreevich Krotov
//        C:\Users\Peter>curl -i -X DELETE -H "Content-Type: application/json" -d "{\"firstName\":\"Peter\",\"middleName\":\"Krotov\",\"lastName\":\"Andreevich\"}" http://localhost:8080/infoGroup
//        HTTP/1.1 200
//        Content-Length: 0
//        Date: Wed, 23 Mar 2022 06:58:44 GMT
@RestController
@RequestMapping("/infoGroup")
public class mySecondController {
    Student stud;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
    public void Student(@Valid @RequestBody Student st){
        stud=st;
    }
    @GetMapping
    public String StudentGet(){
        return stud.name();
    }
    @DeleteMapping
    public void StudentDel(){
        Student stud = null;
    }
}
