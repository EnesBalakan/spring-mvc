package com.springboot.mvc.validationdemo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Car {
    @NotNull(message = "is required!")
    @Size(min = 2, message = "is required!")
    private String brand = "";
    @NotNull(message = "is required!")
    @Size(min = 1, message = "is required!")
    private String model = "";
    private String colour;


    public Car(){

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
