import UserDefined.Student;

public class Main {
    public static void main(String[] args) {

        // Creating user-defined object
        Student student1 = new Student("Maria Santos", 18, 82.5);

        // Calling user-defined methods
        student1.displayInfo();

        if (student1.isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
