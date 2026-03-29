import java.util.Scanner;

class NumberChecker {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define array of 5 elements
        int arraySize   = 5;
        int[] numbers   = new int[arraySize];

        // Take user input for 5 numbers
        System.out.println("Enter " + arraySize + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through array and check positive, negative, zero, even, odd
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last element
        int firstElement = numbers[0];
        int lastElement  = numbers[numbers.length - 1];

        if (firstElement == lastElement) {
            System.out.println("\nFirst and last elements are Equal");
        } else if (firstElement > lastElement) {
            System.out.println("\nFirst element " + firstElement + 
                               " is Greater than last element " + lastElement);
        } else {
            System.out.println("\nFirst element " + firstElement + 
                               " is Less than last element " + lastElement);
        }
        input.close();
    }
}