package com.rental.models;

public class Car implements Rentable{
    private String model;
    private double dailyRate;

    public Car(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double calculateRent(int days){
        return dailyRate * days;
    }
    @Override
    public String getDetails() {
        return "Car - " + model;
    }
}
