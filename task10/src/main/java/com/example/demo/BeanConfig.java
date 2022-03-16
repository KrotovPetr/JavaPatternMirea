package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Knight knight() {
        return new KingofKnights();
    }

    @Bean
    public Army army(Knight knight){
        Army army = new Army(knight);
        return army;
    }

    @Bean
    public Trousers trousers() {
        return new Joggers();
    }

    @Bean
    public Kostya kostya(Trousers trousers) {
        Kostya kostya = new Kostya();
        kostya.setTrousers(trousers);
        return kostya;
    }
}