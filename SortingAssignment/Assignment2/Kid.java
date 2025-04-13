package Assignment2;

public class Kid implements Comparable<Kid> {
    private String name;
    private int age;
    private int heightInCm;
    private int hairLengthInCm;

    public Kid(String name, int age, int heightInCm, int hairLengthInCm) {
        this.name = name;
        this.age = age;
        this.heightInCm = heightInCm;
        this.hairLengthInCm = hairLengthInCm;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getHairLengthInCm() {
        return hairLengthInCm;
    }

    @Override
    public String toString() {
        return "Kid {" + "Name: " + name + " Age: " + age + " Height In Cm: " + heightInCm + " Hair Length In Cm: " + hairLengthInCm + "}";
    }

    @Override
    public int compareTo(Kid other) {
        return Integer.compare(this.heightInCm, other.heightInCm);
    }
}
