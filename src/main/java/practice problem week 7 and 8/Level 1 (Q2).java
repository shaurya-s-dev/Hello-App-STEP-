import java.util.Scanner;

class MaxHandshakes {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.err.println("Invalid input. Enter positive number.");
            System.exit(0);
        }

        // Calculate max handshakes using method
        int maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of handshakes among " +
                           numberOfStudents + " students is " + maxHandshakes);
        input.close();
    }
}