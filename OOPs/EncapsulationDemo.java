package OOPs;

/**
 * Demonstrates Data Hiding & Encapsulation using private fields, validation in setters, and getters.
 */
public class EncapsulationDemo {

    public static class EncapsulatedStudent {
        private String name;
        private int rollNo;

        // Setter with input validation
        public void setName(String name) {
            if (name != null && !name.trim().isEmpty()) {
                this.name = name;
            } else {
                System.out.println("Error: Name cannot be null or empty!");
            }
        }

        public String getName() {
            return this.name;
        }

        public void setRollNo(int rollNo) {
            if (rollNo > 0) {
                this.rollNo = rollNo;
            } else {
                System.out.println("Error: Roll number must be positive!");
            }
        }

        public int getRollNo() {
            return this.rollNo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Encapsulation & Validation Demo ===");
        EncapsulatedStudent s = new EncapsulatedStudent();

        // Valid update
        s.setName("Aman");
        s.setRollNo(138018);
        System.out.println("Updated Name: " + s.getName());
        System.out.println("Updated Roll No: " + s.getRollNo());

        // Invalid update test
        System.out.println("\n--- Testing Invalid Input Validation ---");
        s.setName(""); // Invalid name
        s.setRollNo(-5); // Invalid roll number
    }
}
