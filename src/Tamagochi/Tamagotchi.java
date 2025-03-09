package Tamagochi;

import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {

    private String name;
    private int age;
    private String gender;
    private int mood;
    private int energy;
    private int hunger;

    public Tamagotchi(String name, int age, String gender, int mood, int energy, int hunger) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.energy = energy;
        this.mood = mood;
        this.hunger = hunger;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = Math.min(mood, 100);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(energy, 100);
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = Math.min(hunger, 100);
    }

    // Methods
    public void play() throws InterruptedException {
        if (getEnergy() < 30) {
            System.out.println(getName() + " is too tired to play right now");
            return;
        } else if (getMood() < 5) {
            System.out.println(getName() + " is not in the mood to play right now");
            return;
        }
        System.out.println("How would you like to play with " + getName() + "?");
        System.out.println("1. Throw Ball | 2. Throw Frisbee | 3. Play Tug-of-War");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.println("You threw a ball!");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has fetched the ball");
                    Thread.sleep(1000);
                    setEnergy(getEnergy() - 20);
                    setMood(getMood() + 30);
                    setHunger(getHunger() - 40);
                    return;
                case "2":
                    System.out.println("You threw a frisbee!");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has fetched the frisbee");
                    Thread.sleep(1000);
                    setEnergy(getEnergy() - 15);
                    setMood(getMood() + 25);
                    setHunger(getHunger() - 20);
                    return;
                case "3":
                    System.out.println("You and " + getName() + " play Tug-of-War!");
                    Thread.sleep(1000);
                    Random random = new Random();
                    int tugOfWarOutCome = random.nextInt(0, 5);
                    if (tugOfWarOutCome > 0) {
                        System.out.println("You let " + getName() + " win Tug-of-War");
                        setMood(getMood() + 35);
                    } else {
                        System.out.println("You didn't let " + getName() + " win Tug-of-War");
                        setMood(getMood() - 5);
                    }
                    setEnergy(getEnergy() - 30);
                    setHunger(getHunger() - 25);
                    Thread.sleep(1000);
                    return;
                default:
                    Main.invalidInputMessage();
            }
        }
    }

    public void feed() throws InterruptedException {
        if (getHunger() > 50) {
            System.out.println(getName() + " is not currently hungry");
            return;
        }
        System.out.println("What do you want to feed " + getName() + " with?");
        System.out.println("1. Small Snack | 2. Medium Meal | 3. Large Meal");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.println("You fed " + getName() + " a small snack");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the small sized snack");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 10);
                    return;
                case "2":
                    System.out.println("You fed " + getName() + " a medium meal");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the medium sized meal");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 20);
                    return;
                case "3":
                    System.out.println("You fed " + getName() + " a large meal");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the large sized meal");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 30);
                    return;
            }
        }
    }

    public void sleep() throws InterruptedException {
        if (getEnergy() > 70) {
            System.out.println(getName() + " is not tired enough to sleep");
        } else {
            System.out.println(getName() + " is going to sleep...");
            setEnergy(getEnergy() + 50);
            setHunger(getHunger() - 40);
            Thread.sleep(3000);
            System.out.println(getName() + " has slept and is now well rested");
            Thread.sleep(1000);
        }
    }
}