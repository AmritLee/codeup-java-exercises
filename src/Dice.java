import java.util.Scanner;

public class Dice {

    static int j = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userChoice;
        do {
            System.out.println("Enter the number of sides (#4-20) to roll for a pair of dice: ");
            int userInput = getInteger(4, j);

            int dieRoll1 = getRandom(1, userInput);
            System.out.println("Your first roll yielded: " + dieRoll1);
            int dieRoll2 = getRandom(1, userInput);
            System.out.println("Your second roll yielded: " + dieRoll2);
            int yourRoll = dieRoll1 + dieRoll2;
            System.out.println("Your total roll is " + yourRoll);

            int aiRoll1 = getRandom(1, userInput);
            System.out.println("Your opponent's first roll was: " + aiRoll1);
            int aiRoll2 = getRandom(1, userInput);
            System.out.println("Your opponent's second roll was: " + aiRoll2);
            int aiRoll = aiRoll1 + aiRoll2;
            System.out.println("Your opponent rolled a(n) " + aiRoll);

            if (aiRoll > yourRoll) {
                System.out.println("~~You lose!~~");
            } else if (aiRoll == yourRoll) {
                System.out.println("~~It was a tie!~~");
            } else {
                System.out.println("~~You win!~~");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            userChoice = scanner.nextLine().toLowerCase();
        } while (userChoice.equals("yes") || userChoice.equals("y"));

        System.out.println("Thank you for playing!");
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
                    System.out.println("Please enter a number between 4 and 20");
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
