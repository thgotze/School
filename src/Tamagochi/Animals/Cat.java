package Tamagochi.Animals;

import Tamagochi.Tamagotchi;

public class Cat extends Tamagotchi {

    private int lives = 9;

    public Cat(String name, int age, String gender, double mood, double energy, int lives) {
        super(name, age, gender, mood, energy);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    @Override
    public void play() {
        if (getMood() < 0.5) {
            System.out.println("Cat is unhappy and doesn't want to play");
        }
    }
}
