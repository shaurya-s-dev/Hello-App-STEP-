import java.util.Scanner;

class NumberSignChecker {

    // Method to check sign: returns 1 for positive, -1 for negative, 0 for zero
    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check sign using method
        int sign = checkSign(number);

        // Display result
        if (sign == 1) {
            System.out.println(number + " is Positive");
        } else if (sign == -1) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
        input.close();
    }
}