import java.util.Scanner;

class StudentVotingAge {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define array size and voting age threshold
        int classSize   = 10;
        int votingAge   = 18;
        int[] ages      = new int[classSize];

        // Take user input for age of all 10 students
        System.out.println("Enter age of " + classSize + " students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        // Loop through array and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + 
                                   ": Invalid age " + ages[i]);
            } else if (ages[i] >= votingAge) {
                System.out.println("The student with age " + ages[i] + 
                                   " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + 
                                   " cannot vote.");
            }
        }
        input.close();
    }
}