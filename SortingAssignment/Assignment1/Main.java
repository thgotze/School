package Assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        runSortingOfCars();
    }

    public static void runSortingOfCars() {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("100");
        Car car2 = new Car("50");
        Car car3 = new Car("200");
        Car car4 = new Car("25");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println(cars);

        for (Car car : cars) {
            System.out.println(car.getPlate());
        }

        Collections.sort(cars);

        System.out.println(cars);

        for (Car car : cars) {
            System.out.println(car.getPlate());
        }

        Collections.reverse(cars);

        System.out.println(cars);

        for (Car car : cars) {
            System.out.println(car.getPlate());
        }
    }
}