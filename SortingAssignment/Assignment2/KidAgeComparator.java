package Assignment2;

import java.util.Comparator;

public class KidAgeComparator implements Comparator<Kid> {

    @Override
    public int compare(Kid kid1, Kid kid2) {
        return Integer.compare(kid1.getAge(), kid2.getAge());
    }
}