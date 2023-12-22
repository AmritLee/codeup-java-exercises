import java.util.Scanner;

public class Dice {

    static int j = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number of sides (#4-20) to roll for a pair of dice: ");
            int userInput = getInteger(4, j);
            int dieRoll1 = getRandom(1, userInput);
            System.out.println("Your first roll yielded: " + dieRoll1);
            int dieRoll2 = getRandom(1, userInput);
            System.out.println("Your second roll yielded: " + dieRoll2);
            System.out.println("Your total roll is " + (dieRoll1 + dieRoll2));

            System.out.print("Do you want to continue? (yes/no): ");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thank you!");
        scanner.close();
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            try {
                userInput = Integer.parseInt(scanner.nextLine());

                if (userInput >= min && userInput <= max) {
                    break;
                } else {
                    System.out.println("Please enter an integer between 4 and 20");
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        return userInput;
    }

    public static int getRandom(int min, int max) {
        int range = (max - min) + 1;
        int random = (int) (Math.random() * range) + min;
        return random;
    }
}
