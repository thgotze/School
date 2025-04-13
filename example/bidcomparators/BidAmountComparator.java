package org.example.bidcomparators;

import org.example.Bid;

import java.util.Comparator;

public class BidAmountComparator implements Comparator<Bid> {

    @Override
    public int compare(Bid bid1, Bid bid2) {
        return Integer.compare(bid2.getAmount(), bid1.getAmount());
    }
}