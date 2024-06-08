package task4;

//User-defined exception class
class InvalidAgeForVoterException extends Exception {
 public InvalidAgeForVoterException(String message) {
     super(message);
 }
}

//Voter class
class Voter {
 private int voterId;
 private String name;
 private int age;

 // Parameterized constructor
 public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
     if (age < 18) {
         throw new InvalidAgeForVoterException("Invalid age for voter");
     }
     this.voterId = voterId;
     this.name = name;
     this.age = age;
 }

 // Getters for the attributes
 public int getVoterId() {
     return voterId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 @Override
 public String toString() {
     return "Voter [Voter ID: " + voterId + ", Name: " + name + ", Age: " + age + "]";
 }
}



public class VoterManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Voter voter1 = new Voter(101, "John Doe", 25);
            System.out.println(voter1);

            // This will throw an exception
            Voter voter2 = new Voter(102, "Jane Smith", 17);
            System.out.println(voter2);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }

	}


