package Tamagochi;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-*-*- Tamogochi -*-*-");
        System.out.println("Would you like to adopt a pet? Type 1 - 3 to adopt a pet.");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Parrot");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("1") || input.equalsIgnoreCase("Dog")) {
                adoptPet("Dog");
                break;
            } else if (input.equals("2") || input.equalsIgnoreCase("Cat")) {
                adoptPet("Cat");
                break;
            } else if (input.equals("3") || input.equalsIgnoreCase("Parrot")) {
                adoptPet("Parrot");
                break;
            } else {
                invalidInputMessage();
            }
        }
    }

    public static void invalidInputMessage() {
        System.out.println("Invalid input! Try again.");
    }

    public static void adoptPet(String petType) {
        Random random = new Random();
        int age = random.nextInt(5);
        int gender = random.nextInt(2);
        String genderString;

        if (gender == 0) {
            genderString = "male";
        } else {
            genderString = "female";
        }
        double mood = random.nextDouble();
        double energy = random.nextDouble();

        System.out.println("You have chosen to adopt a " + petType + "!");
        System.out.println("Your pet is a ");
        Tamagotchi tamagotchi = new Tamagotchi(age, genderString, mood, energy);
        System.out.println();
    }
}
