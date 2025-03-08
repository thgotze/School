package Tamagochi;

public class Tamagotchi {

    private String name;
    private int age;
    private String gender;
    private double mood;
    private double energy;

    public Tamagotchi(int age, String gender, double mood, double energy) {
        this.age = age;
        this.gender = gender;
        this.mood = mood;
        this.energy = energy;
    }

    public Tamagotchi(String name, int age, String gender, double mood, double energy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.energy = energy;
        this.mood = mood;
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

    public double getMood() {
        return mood;
    }

    public void setMood(double mood) {
        this.mood = mood;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    // Methods
    public void play() {
        energy -= 0.1;

        System.out.println(getName());
    }

    public void feed() {

    }

    public void sleep() {
        if (energy > 0.5) {
            System.out.println(getName() + "'s energy is over 0.5. Cannot sleep unless tired!");
        } else {
            System.out.println(getName() + " is going to sleep...");
            energy += 0.5;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " has slept and is now well rested");
        }
    }

    public void pet() {

    }
}