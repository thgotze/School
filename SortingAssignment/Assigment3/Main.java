package Assigment3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Mike", 1234, false, 'M');
        Student student2 = new Student("Mika", 9987, true, 'F');
        Student student3 = new Student("Micheal", 2211, true, 'M');
        Student student4 = new Student("Mikeline", 1121, false, 'F');
        Student student5 = new Student("Micheangelo", 5532, true, 'M');
        Student student6 = new Student("Mikeceline", 7521, true, 'F');

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("Unsorted students array\n" + students);

        Collections.sort(students);
        System.out.println("Sorted students array (Name)\n" + students);

        students.sort(new StudentZipCodeComparator());
        System.out.println("Sorted students array (ZipCode)\n" + students);

        students.sort(new StudentLivingWithParentsComparator());
        System.out.println("Sorted students array (Living With Parents)\n" + students);

        students.sort(new StudentGenderComparator());
        System.out.println("Sorted students array (Gender - Female First)\n" + students);

        System.out.println("Sorted students array (Gender - Male First)\n" + students.reversed());
    }
}
