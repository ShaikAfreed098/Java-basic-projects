package studentgrademanagementsystem;
import java.util.*;

class Student {
    private String name;
    private String id;
    private int marks;
    public Student(String name, String id, int marks) {
        this.name = name;
        this.id = id;
        setMarks(marks);
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            this.marks = 0;
        }
    }
    public String getGradeLetter() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }
    public void displayStudent() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Marks  : " + marks);
        System.out.println("Grade  : " + getGradeLetter());
        System.out.println("-------------------------");
    }
}
public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    calculateAverage();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    public static void addStudent() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(name, id, marks));
        System.out.println("Student added successfully!");
    }
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
        Student s = students.get(i);  
        s.displayStudent();
        }
    }
    public static void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        int total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }

        double average = (double) total / students.size();
        System.out.println("Average Marks: " + average);
    }
}
