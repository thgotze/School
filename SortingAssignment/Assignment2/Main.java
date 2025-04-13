package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        runSortingOfKids();
    }

    private static void runSortingOfKids() {

        ArrayList<Kid> kids = new ArrayList<>();

        Kid kid1 = new Kid("Bob", 10, 120, 13);
        Kid kid2 = new Kid("Bobber", 11, 125, 15);
        Kid kid3 = new Kid("Bobberon", 9, 130, 10);
        Kid kid4 = new Kid("Bobberino", 9, 98, 35);

        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        kids.add(kid4);

        System.out.println("Unsorted kids array\n" + kids);

        Collections.sort(kids);
        System.out.println("Sorted kids array (Height)\n" + kids);

        kids.sort(new KidAgeComparator());
        System.out.println("Sorted kids array (Age)\n" + kids);

        kids.sort(new KidHairLengthComparator());
        System.out.println("Sorted kids array (Hair Length)\n" + kids);
    }
}
