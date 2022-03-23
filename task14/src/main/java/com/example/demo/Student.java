package com.example.demo;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public void setFirstName(String fn){
        firstName = fn;
    }

    public void setMiddleName(String mn){
        middleName = mn;
    }

    public void setLastName(String ln){
        lastName = ln;
    }

    public String name(){
        return firstName + " "+ lastName + " " + middleName;
    }


}
