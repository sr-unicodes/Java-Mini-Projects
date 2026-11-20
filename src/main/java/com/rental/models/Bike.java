package com.rental.models;

public class Bike implements Rentable{

    private String brand;
    private double hourlyRate;

    public Bike(String brand, double hourlyRate){
        this.brand = brand;
        this.hourlyRate = hourlyRate;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public double calculateRent(int days){
        return hourlyRate * 24 * days;
    }

    @Override
    public String getDetails() {
        return "Bike - " + brand;
    }
}
