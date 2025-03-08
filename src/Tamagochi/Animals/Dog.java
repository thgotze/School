package Tamagochi.Animals;

import Tamagochi.Tamagotchi;

public class Dog extends Tamagotchi {

    private boolean hungry;

    public Dog(String name, int age, String gender, double mood, double energy, boolean hungry) {
        super(name, age, gender, mood, energy);
        this.hungry = hungry;
    }

    @Override
    public void sleep() {
        if (getEnergy() > 0.5) {
            System.out.println(getName() + " is too exited and cannot sleep");
        } else {
            super.sleep();
        }
    }

    public void bark() {
        System.out.println(getName() + ": WOOF!");
    }


}
