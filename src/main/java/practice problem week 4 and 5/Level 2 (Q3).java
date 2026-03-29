import java.util.Scanner;

class LargestSecondLargestDigit {
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

        // Define array to store digits with dynamic resizing
        int maxDigit  = 10;
        int[] digits  = new int[maxDigit];
        int index     = 0;
        int temp      = number;

        // Extract digits and store in array
        while (temp != 0) {
            // Resize array if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit     = maxDigit * 2;
                int[] newArr = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    newArr[i] = digits[i];
                }
                digits = newArr;
            }
            digits[index] = temp % 10;
            temp          = temp / 10;
            index++;
        }

        // Find largest and second largest digit
        int largest       = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest       = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: "       + largest);
        System.out.println("Second largest digit: " + secondLargest);
        input.close();
    }
}