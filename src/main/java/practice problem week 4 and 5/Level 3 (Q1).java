import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid input. Enter a positive number.");
            System.exit(0);
        }

        // Find count of digits in number
        int count = 0;
        int temp  = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        int   orig   = number;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number    /= 10;
        }

        // Define frequency array of size 10 (digits 0-9)
        int totalDigits    = 10;
        int[] frequency    = new int[totalDigits];

        // Count frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies in " + orig + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("  Digit " + i + 
                                   " appears " + frequency[i] + " time(s)");
            }
        }
        input.close();
    }
}