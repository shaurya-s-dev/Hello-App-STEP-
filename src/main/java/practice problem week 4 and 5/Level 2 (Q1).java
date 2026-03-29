import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user and check for natural number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate natural number
        if (number > 0) {
            // Loop from 1 to number and check odd or even
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a positive integer");
        }
        input.close();
    }
}