import java.util.Scanner;
/**
* This program calculates amount of Energy released when mass is converted to
* energy.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-02-21
*/

public final class Microwave {
    /**
    * This is a private constructor use to
    * satisfy the style checker.
    *
    * @exception IllegalStateException Utility Class.
    * @see IllegalStateException
    */
    private Microwave() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    *
    */
    public static void main(String[] args) {
        // Constants that represent time for each food
        final int pizzaTime = 45;
        final int subTime = 60;
        final int soupTime = 105;
        final int secPerMin = 60;

        // These constants are user choices
        final String pizzaChoice = "pizza";
        final String subChoice = "sub";
        final String soupChoice = "soup";

        // This are the max and min numbers user can input
        final int max = 3;
        final int min = 0;

        String foodChoice = "";
        String itemNumberString = "";
        int itemNumberInt = 0;
        double time = 0;

        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting the user food choice
        System.out.print("Enter your option (pizza, sub, soup): ");
        foodChoice = scanner.nextLine();

        // Check to make sure its a valid selection
        if (foodChoice.equals(pizzaChoice) || foodChoice.equals(subChoice)
            || foodChoice.equals(soupChoice)) {
            // get number of items as string
            System.out.print("Enter the number of items: ");
            itemNumberString = scanner.nextLine();

            // convert the item number to an int
            try {
                itemNumberInt = Integer.parseInt(itemNumberString);

                // check if the food choice was soup
                if (foodChoice.equals(soupChoice)) {
                    // Doing the math to calculate the time
                    if (itemNumberInt == 1) {
                        time = soupTime * 1;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 1.5) {
                        time = soupTime * 1.5;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 2) {
                        time = soupTime * 2;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else {
                        System.out.println("You entered an invalid number.");
                    }
                } else if (foodChoice.equals(subChoice)) {
                    if (itemNumberInt == 1) {
                        time = subTime * 1;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 1.5) {
                        time = subTime * 1.5;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 2) {
                        time = subTime * 2;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else {
                        System.out.println("please enter a valid number.");
                    }
                } else {
                    if (itemNumberInt == 1) {
                        time = pizzaTime * 1;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 1.5) {
                        time = pizzaTime * 1.5;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else if (itemNumberInt == 2) {
                        time = pizzaTime * 2;
                        System.out.println("The time need to microwave the is " + time + " seconds.");
                    } else {
                        System.out.println("Your number is invalid.");
                    }
                }
            } catch (NumberFormatException error) {
                System.out.println("That input is invalid. "
                    + error.getMessage());
            }
        } else {
            System.out.println("Your selection must be either pizza,"
                + " sub or soup");
        }
    }
}