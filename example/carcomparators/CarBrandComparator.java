package org.example.carcomparators;

import org.example.Car;

import java.util.Comparator;

public class CarBrandComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getBrand().compareTo(car2.getBrand());
    }
}