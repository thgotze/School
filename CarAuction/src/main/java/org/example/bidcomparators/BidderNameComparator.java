package org.example.bidcomparators;

import org.example.Bid;

import java.util.Comparator;

public class BidderNameComparator implements Comparator<Bid> {

    @Override
    public int compare(Bid bid1, Bid bid2) {
        return bid1.getBidderName().compareTo(bid2.getBidderName());
    }
}