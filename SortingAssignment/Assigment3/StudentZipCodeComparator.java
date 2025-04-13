package Assigment3;

import java.util.Comparator;

public class StudentZipCodeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getZipCode(), student2.getZipCode());
    }
}
