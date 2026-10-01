package OOPs;

/**
 * Demonstrates Class, Objects, Default & Parameterized Constructors, and instance methods.
 */
public class StudentDemo {

    // Student Blueprint Class
    public static class Student {
        String name;
        int rollNo;
        int marks;

        // Default Constructor
        public Student() {
            this.name = "Default Student";
            this.rollNo = 101;
            this.marks = 0;
        }

        // Parameterized Constructor
        public Student(String name, int rollNo, int marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        // Instance method to display student profile
        public void displayDetails() {
            System.out.println("--- Student Details ---");
            System.out.println("Name     : " + this.name);
            System.out.println("Roll No  : " + this.rollNo);
            System.out.println("Marks    : " + this.marks);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Instantiating Object with Parameterized Constructor ===");
        Student student1 = new Student("Aman Kumar Singh", 7, 100);
        student1.displayDetails();

        System.out.println("\n=== 2. Instantiating Object with Default Constructor ===");
        Student student2 = new Student();
        student2.displayDetails();
    }
}
