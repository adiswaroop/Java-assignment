
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return "Student{ name = " + this.name + ", marks = "+ this.marks + "}";
    }
} 

public class Prog8 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Adi", 90),
            new Student("Sid", 95),
            new Student("Ravi", 55)
        };

        System.out.println("Before Sorting");

        for (Student s: students) {
            System.out.println(s);
        }

        Arrays.sort(students);

        System.out.println("After sorting");
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
