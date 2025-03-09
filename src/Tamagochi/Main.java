package Tamagochi;

import Tamagochi.Animals.Cat;
import Tamagochi.Animals.Dog;
import Tamagochi.Animals.Parrot;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        System.out.println("Invalid input! Try again");
    }

    public static void adoptPet(String petType) throws InterruptedException {
        Random random = new Random();
        int age = random.nextInt(5);

        int gender = random.nextInt(2);
        String genderString;
        if (gender == 0) {
            genderString = "male";
        } else {
            genderString = "female";
        }
        int mood = random.nextInt(30, 70);
        int energy = random.nextInt(30, 70);
        int hunger = random.nextInt(30, 70);

        System.out.println("You have chosen to adopt a " + petType.toLowerCase() + "!");
        Thread.sleep(1000);
        System.out.println("Your pet is a " + age + " year old " + genderString + " " + petType.toLowerCase());
        Thread.sleep(1000);
        if (gender == 0) {
            System.out.println("What would you like to name him?");
        } else {
            System.out.println("What would you like to name her?");
        }

        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                invalidInputMessage();
            } else {
                break;
            }
        }
        System.out.println("You have named your " + petType.toLowerCase() + " " + name);
        Thread.sleep(1000);

        switch (petType) {
            case "Dog" -> {
                Dog dog = new Dog(petType, name, age, genderString, mood, energy, hunger);
                displayPetInfo(dog);
                startActivity(dog);
            }
            case "Cat" -> {
                int lives = 9;
                Cat cat = new Cat(petType, name, age, genderString, mood, energy, hunger);
                displayPetInfo(cat);
                startActivity(cat);
            }
            case "Parrot" -> {
                Parrot parrot = new Parrot(petType, name, age, genderString, mood, energy, hunger);
                displayPetInfo(parrot);
                startActivity(parrot);
            }
        }
    }

    public static void displayPetInfo(Tamagotchi tamagotchi) throws InterruptedException {
        System.out.println(tamagotchi.getName() + "'s current health:");
        System.out.println("Mood: " + tamagotchi.getMood() + " | Energy: " + tamagotchi.getEnergy() + " | Hunger: " + tamagotchi.getHunger());
        Thread.sleep(2000);
    }

    public static void startActivity(Tamagotchi tamagotchi) throws InterruptedException {
        System.out.println("-------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. Play | 2. Feed | 3. Sleep | 4. Display Pet Info");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    tamagotchi.play();
                    break;
                case "2":
                    tamagotchi.feed();
                    break;
                case "3":
                    tamagotchi.sleep();
                    break;
                case "4":
                    displayPetInfo(tamagotchi);
                    break;
                default:
                    invalidInputMessage();
            }
            startActivity(tamagotchi);
        }
    }
}
