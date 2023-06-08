package lab02;


import java.util.Scanner;

public class Main 
{
    /**
     * Main file for calculating vacations
     */
    public static void main(String[] args) {
        final int SHORTDURATION = 7; 
        final double PENALTYDURATION = 200;
        final int LONGDURATION = 30;;
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.println("Welcome to the Vacation Package Calculator!");
        System.out.print("Enter destination (Paris, New York City): ");
        String destination = scanner.nextLine();
        System.out.print("Enter number of travelers: ");
        int numTravelers = scanner.nextInt();
        System.out.print("Enter duration of vacation in days: ");
        int duration = scanner.nextInt();

        // Calculating total cost
        int baseCost = 1000;
        int totalCost = baseCost;

        boolean isValidInput = true;

        if (destination.equalsIgnoreCase("Paris")) {
            totalCost += 500;
        } else if (destination.equalsIgnoreCase("New York City")) {
            totalCost += 600;
        } else {
            totalCost += 0;
        }

        if (numTravelers > 4 && numTravelers < 10) {
            totalCost -= totalCost * 0.1;
        } else if (numTravelers > 10) {
            totalCost -= totalCost * 0.2;
        } else if (numTravelers < 1 || numTravelers > 80) {
            isValidInput = false;
        }

        if (duration < SHORTDURATION) {
            totalCost += PENALTYDURATION;
        } else if (duration > 30 || numTravelers == 2) {
            totalCost -= 200;
        }

        // Validating input
        if (isValidInput) {
            System.out.println("Total cost is: $" + totalCost);
        } else {
            System.out.println("Invalid input. Can't calculate the cost.");
        }

        scanner.close();
        System.exit(0);
    }
}