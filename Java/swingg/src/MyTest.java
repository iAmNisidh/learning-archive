import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks; // Ascending order by marks
    }

    public String toString() {
        return name + ":" + marks;
    }
}

public class MyTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ankit", 85));
        list.add(new Student("Bhavna", 92));
        list.add(new Student("Chirag", 78));

        Collections.sort(list);

        for (Student s : list)
            System.out.println(s);
    }
}
