import java.util.Scanner;

class YoungestTallestFriend {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define friend names, age and height arrays
        int      totalFriends = 3;
        String[] names        = {"Amar", "Akbar", "Anthony"};
        int[]    ages         = new int[totalFriends];
        double[] heights      = new double[totalFriends];

        // Take input for age and height of 3 friends
        for (int i = 0; i < totalFriends; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("  Age: ");
            ages[i] = input.nextInt();
            System.out.print("  Height (cm): ");
            heights[i] = input.nextDouble();
        }

        // Find youngest friend
        int    youngestAge   = ages[0];
        String youngestName  = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge  = ages[i];
                youngestName = names[i];
            }
        }

        // Find tallest friend
        double tallestHeight = heights[0];
        String tallestName   = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestName   = names[i];
            }
        }

        // Display results
        System.out.println("\nYoungest friend: " + youngestName + 
                           " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: "  + tallestName + 
                           " (Height: " + tallestHeight + " cm)");
        input.close();
    }
}