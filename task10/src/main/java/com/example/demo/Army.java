package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Army {
    private final Knight knight;
    public Army(Knight knight) {
        this.knight = knight;

    }

    public void letsFight() {
        knight.fight();
    }
}
