package Assigment3;

import java.util.Comparator;

public class StudentGenderComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Character.compare(student1.getGender(), student2.getGender());
    }
}
