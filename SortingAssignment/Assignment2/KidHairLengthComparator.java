package Assignment2;

import java.util.Comparator;

public class KidHairLengthComparator implements Comparator<Kid> {

    @Override
    public int compare(Kid kid1, Kid kid2) {
        return Integer.compare(kid1.getHairLengthInCm(), kid2.getHairLengthInCm());
    }
}