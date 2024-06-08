package task4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
	// HashMap to store student names and grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for " + name + ": " + grade);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentGrades studentGrades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        // Adding students
        studentGrades.addStudent("Alice", 85);
        studentGrades.addStudent("Bob", 90);
        studentGrades.addStudent("Charlie", 78);

        // Displaying a student's grade
        System.out.print("Enter the name of the student to display the grade: ");
        String nameToDisplay = scanner.nextLine();
        studentGrades.displayGrade(nameToDisplay);

        // Removing a student
        System.out.print("Enter the name of the student to remove: ");
        String nameToRemove = scanner.nextLine();
        studentGrades.removeStudent(nameToRemove);

        // Displaying a student's grade after removal
        System.out.print("Enter the name of the student to display the grade: ");
        nameToDisplay = scanner.nextLine();
        studentGrades.displayGrade(nameToDisplay);

        scanner.close();
    }

		
	}


