package com.example.demo;

public class Kostya {
    private Trousers trousers;

    public void walk() {
        System.out.println("I'm wearing " +
                trousers.getName());
    }
    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }
}


interface Trousers {
    String getName();
}

class Joggers implements Trousers{
    @Override
    public String getName() {
        return "Joggers!";
    }
}

class Pantaloons implements Trousers {
    @Override
    public String getName() {
        return "Pantaloons....";
    }
}

