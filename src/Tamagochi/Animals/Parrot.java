package Tamagochi.Animals;

import Tamagochi.Tamagotchi;

import java.util.Scanner;

public class Parrot extends Tamagotchi {

    private final String animalType;

    public Parrot(String animalType, String name, int age, String gender, int mood, int energy, int hunger) {
        super(name, age, gender, mood, energy, hunger);
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void feed() throws InterruptedException {
        if (getHunger() > 50) {
            System.out.println(getName() + " is not currently hungry");
            return;
        }
        System.out.println("What do you want to feed " + getName() + " with?");
        System.out.println("1. Nuts | 2. Fruit | 3. Vegetable");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.println("You fed " + getName() + " some nuts");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the nuts");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 5);
                    return;
                case "2":
                    System.out.println("You fed " + getName() + " some fruit");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the fruit");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 10);
                    return;
                case "3":
                    System.out.println("You fed " + getName() + " some vegetables");
                    Thread.sleep(1000);
                    System.out.println(getName() + " has eaten the vegetables");
                    Thread.sleep(1000);
                    setHunger(getHunger() + 15);
                    return;
            }
        }
    }
}
