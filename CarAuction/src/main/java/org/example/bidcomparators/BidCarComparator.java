package org.example.bidcomparators;

import org.example.Bid;

import java.util.Comparator;

public class BidCarComparator implements Comparator<Bid> {

    @Override
    public int compare(Bid bid1, Bid bid2) {
        int result = bid1.getCar().getBrand().compareTo(bid2.getCar().getBrand());
        if (result == 0) {
            result = bid1.getCar().getModel().compareTo(bid2.getCar().getModel());
        }
        return result;
    }
}