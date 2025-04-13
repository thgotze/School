package org.example;

import org.example.bidcomparators.BidAmountComparator;
import org.example.carcomparators.CarBrandComparator;
import org.example.carcomparators.CarPriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        InMemoryCarRepository carRepository = new InMemoryCarRepository();
//        InMemoryBidRepository bidRepository = new InMemoryBidRepository();
//
//        CarService carService = new CarService(carRepository);
//        BidService bidService = new BidService(bidRepository, carRepository);
//
//        AuctionController controller = new AuctionController(carService, bidService);
//        controller.start();
        runCarAuctionProgram();
    }

    private static void runCarAuctionProgram() {
        List<Car> cars = new ArrayList<>();
        List<Bid> bids = new ArrayList<>();

        Car car1 = new Car("Toyota", "Corolla", 2015, 80000, "AB12345");
        Car car2 = new Car("Ford", "Mustang", 2020, 300000, "CD67890");
        Car car3 = new Car("Volkswagen", "Golf", 2018, 120000, "EF11223");
        Car car4 = new Car("Tesla", "Model 3", 2022, 350000, "GH44556");
        Car car5 = new Car("BMW", "3 Series", 2019, 280000, "IJ77889");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Bid bid1 = new Bid("Hannah", 85000, car1);
        Bid bid2 = new Bid("Diana", 310000, car2);
        Bid bid3 = new Bid("Charlie", 125000, car3);
        Bid bid4 = new Bid("Bob", 360000, car4);
        Bid bid5 = new Bid("Fiona", 290000, car5);
        Bid bid6 = new Bid("Ethan", 90000, car1);
        Bid bid7 = new Bid("George", 315000, car2);
        Bid bid8 = new Bid("Alice", 365000, car4);

        bids.add(bid1);
        bids.add(bid2);
        bids.add(bid3);
        bids.add(bid4);
        bids.add(bid5);
        bids.add(bid6);
        bids.add(bid7);
        bids.add(bid8);

        printCars("Unsorted Cars List:", cars);

        Collections.sort(cars);
        printCars("Sorted Cars List (Year):", cars);

        cars.sort(new CarBrandComparator());
        printCars("Sorted Cars List (Brand)", cars);

        cars.sort(new CarPriceComparator());
        printCars("Sorted Cars List (Price):", cars);

        for (Car car : cars) {
            printHighestBidForCar(car, bids);
        }

//        printBids("Unsorted Bids List", bids);
//
//        bids.sort(new BidAmountComparator());
//        printBids("Sorted Bids List (Highest Bid Amount):", bids);
//
//        bids.sort(new BidderNameComparator());
//        printBids("Sorted Bids List (Bidder Name):", bids);
//
//        bids.sort(new BidCarComparator());
//        printBids("Sorted Bids List (Car):", bids);
    }

    private static void printCars(String title, List<Car> cars) {
        System.out.println("\n" + title);
        int carNumber = 1;
        for (Car car : cars) {
            System.out.println("Car " + carNumber++ + ": " + car.toString());
        }
    }

    private static void printHighestBidForCar(Car car, List<Bid> bids) {
        List<Bid> bidsForCar = new ArrayList<>();
        for (Bid bid : bids) {
            if (bid.getCar().equals(car)) {
                bidsForCar.add(bid);
            }
        }

        if (bidsForCar.isEmpty()) {
            System.out.println("\nNo bids for car: " + car);
            return;
        }

        bidsForCar.sort(new BidAmountComparator());

        Bid highestBid = bidsForCar.getFirst();

        System.out.println("\n" + highestBid.getBidderName() + " has the highest bid (" + highestBid.getAmount() + ") on Car: [" + car + "] ");
    }

//    private static void printBids(String title, List<Bid> bids) {
//        System.out.println("\n" + title);
//        int bidNumber = 1;
//        for (Bid bid : bids) {
//            System.out.println("Bid " + bidNumber++ + ": " + bid.toString());
//        }
//    }
}