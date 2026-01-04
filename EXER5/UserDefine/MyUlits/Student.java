package UserDefined;

public class Student {
    // User-defined attributes
    private String name;
    private int age;
    private double grade;

    // User-defined constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // User-defined method
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // User-defined method
    public boolean isPassed() {
        return grade >= 75;
    }
}
