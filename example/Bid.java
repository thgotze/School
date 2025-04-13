package org.example;

public class Bid {
    private String bidderName;
    private int amount;
    private Car car;

    public Bid(String bidderName, int amount, Car car) {
        this.bidderName = bidderName;
        this.amount = amount;
        this.car = car;
    }

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Bidder Name: " + bidderName + " | Amount: " + amount + " | Car: " + car;
    }
}