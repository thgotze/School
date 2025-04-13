package Assignment1;

public class Car implements Comparable<Car> {
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return "Car {" + "Plate: " + plate + "}";
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(Integer.parseInt(this.plate), Integer.parseInt(other.getPlate()));
    }
}