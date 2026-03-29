import java.util.Scanner;

class NumberAccumulator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define array of max 10 elements and total variable
        int    maxSize  = 10;
        double total    = 0.0;
        double[] numbers = new double[maxSize];
        int index        = 0;

        System.out.println("Enter up to " + maxSize + 
                           " numbers (0 or negative to stop):");

        // Use infinite while loop to take input
        while (true) {
            System.out.print("Enter number: ");
            double userInput = input.nextDouble();

            // Break if 0 or negative
            if (userInput <= 0) {
                break;
            }

            // Break if array is full
            if (index == maxSize) {
                System.out.println("Array is full. Maximum " + 
                                    maxSize + " numbers allowed.");
                break;
            }

            // Store number in array and increment index
            numbers[index] = userInput;
            index++;
        }

        // Calculate total from array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers and total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("  " + numbers[i]);
        }
        System.out.println("Total: " + total);
        input.close();
    }
}