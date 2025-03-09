package Tamagochi.Animals;

import Tamagochi.Tamagotchi;

public class Dog extends Tamagotchi {

    private final String animalType;

    public Dog(String animalType, String name, int age, String gender, int mood, int energy, int hunger) {
        super(name, age, gender, mood, energy, hunger);
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void sleep() throws InterruptedException {
        if (getEnergy() > 50) {
            System.out.println(getName() + " is too exited and cannot sleep");
        } else {
            super.sleep();
        }
    }

    public void bark() {
        System.out.println(getName() + ": WOOF!");

    }


}
