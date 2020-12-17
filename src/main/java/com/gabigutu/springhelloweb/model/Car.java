package com.gabigutu.springhelloweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

    private final String name;

    public Car(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
