package task4;


class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range. Age should be between 15 and 21.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters for the attributes
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
    }
}




public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Student student1 = new Student(1, "Alice", 20, "Computer Science");
            System.out.println(student1);

            // This will throw an exception
            Student student2 = new Student(2, "Bob", 22, "Mechanical Engineering");
            System.out.println(student2);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            // This will throw an exception
            Student student3 = new Student(3, "Charlie", 14, "Electrical Engineering");
            System.out.println(student3);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }

	}


