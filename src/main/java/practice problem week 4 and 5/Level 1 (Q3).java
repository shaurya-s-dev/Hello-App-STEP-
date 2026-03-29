import java.util.Scanner;

class MultiplicationTableArray {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Define array to store multiplication results from 1 to 10
        int tableSize              = 10;
        int[] multiplicationResult = new int[tableSize];

        // Calculate and store multiplication results in array
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 1);
        }

        // Display the multiplication table from array
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + 
                               " = " + multiplicationResult[i]);
        }
        input.close();
    }
}