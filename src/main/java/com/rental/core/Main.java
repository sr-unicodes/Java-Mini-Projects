package com.rental.core;

import com.rental.models.Bike;
import com.rental.models.Car;
import com.rental.models.Rentable;


public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda Civic", 50.0);
        Bike bike = new Bike("Trek", 3.5);

        Rentable[] rentals = {car, bike};

        for (Rentable item : rentals) {
            System.out.println(item.getDetails() + " 3-Day Rental Cost: $" + item.calculateRent(3));
        }


    }
}
