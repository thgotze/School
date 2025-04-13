package Assigment3;

public class Student implements Comparable<Student> {
    private String name;
    private int zipCode;
    private boolean livingWithParents;
    private char gender;

    public Student(String name, int zipCode, boolean livingWithParents, char gender) {
        this.name = name;
        this.zipCode = zipCode;
        this.livingWithParents = livingWithParents;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getZipCode() {
        return zipCode;
    }

    public boolean getLivingWithParents() {
        return livingWithParents;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student: {Name: " + name + " Zip Code: " + zipCode + " Living with Parents: " + livingWithParents + " Gender: " + gender + "}";
    }


    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}