import java.util.Scanner;

class AthleteRounds {

    // Method to calculate number of rounds to complete target distance
    public static double calculateRounds(double side1, double side2,
                                          double side3, double targetDistanceM) {
        double perimeter = side1 + side2 + side3;
        return targetDistanceM / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Target distance in meters
        double targetDistanceKm = 5.0;
        double targetDistanceM  = targetDistanceKm * 1000;

        // Take user input for 3 sides of triangle
        System.out.print("Enter side 1 (meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double side3 = input.nextDouble();

        // Calculate rounds using method
        double numberOfRounds = calculateRounds(side1, side2, 
                                                side3, targetDistanceM);

        // Display result
        System.out.println("The total number of rounds the athlete will " +
                           "run is " + numberOfRounds +
                           " to complete " + targetDistanceKm + " km");
        input.close();
    }
}