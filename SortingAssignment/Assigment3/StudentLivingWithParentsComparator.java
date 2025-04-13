package Assigment3;

import java.util.Comparator;

public class StudentLivingWithParentsComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Boolean.compare(student1.getLivingWithParents(), student2.getLivingWithParents());
    }
}
