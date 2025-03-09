package Tamagochi.Animals;

import Tamagochi.Tamagotchi;

public class Cat extends Tamagotchi {

    private final String animalType;

    public Cat(String animalType, String name, int age, String gender, int mood, int energy, int hunger) {
        super(name, age, gender, mood, energy, hunger);
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public void play() throws InterruptedException {
        if (getMood() < 50) {
            System.out.println(getName() + " is unhappy and doesn't want to play");
        } else {
            super.play();
        }
    }
}
