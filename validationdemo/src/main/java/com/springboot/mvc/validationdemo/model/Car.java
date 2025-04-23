package com.springboot.mvc.validationdemo.model;

import jakarta.validation.constraints.*;

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

    //belirli aralıkta sayı girişini sağlamak için
    @Min(value = 1, message = "must be bigger than 0!")
    @Max(value = 10, message = "must be smaller than  11!")
    private int freePasses;

    //Düzenli ifadeler (regular expressions) metin verilerini doğrulamak, aramak ve değiştirmek için kullanılır.
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
    private String licencePlate;




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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
