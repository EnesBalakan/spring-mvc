package com.springboot.mvc.validationdemo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Car {
    @NotNull(message = "is required!")
    @Size(min = 2, message = "is required!")
    private String brand = "";
    @NotNull(message = "is required!")
    @Size(min = 1, message = "is required!")
    private String model = "";
    @NotNull(message = "is required!")
    @Size(min = 4, max = 4, message = "please enter number between 999 and 2026")
    private String year;
    private List<String> country;



    public Car(){

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }
}
