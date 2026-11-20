package com.rental.models;

public interface Rentable {
    double calculateRent(int days);
    String getDetails();
}