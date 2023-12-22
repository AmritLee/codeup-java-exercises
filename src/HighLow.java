import java.util.Scanner;

public class HighLow {

    static int j = 100;
    static int k = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = getRandom(1, j);
        System.out.println("A number is chosen between 1 and 100. Guess the number:");

        for (int i = 0; i < k; i++) {
            int userNum = getInteger(1, j);
            int remainingTries = (k - i) - 1;

            if (userNum == randomNum) {
                System.out.println("YOU GOT IT RIGHT!");
                break;
            } else if (userNum < randomNum) {
                System.out.println("HIGHER. You have " + remainingTries+ " tries left. ");
            } else {
                System.out.println("LOWER. You have " + remainingTries+ " tries left. ");
            }

            if (i == k - 1) {
                System.out.println("\nYou ran out of guesses. :(");
                System.out.println("The number was " + randomNum);
            }
        }

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
                    System.out.println("Enter a whole number between 1 and 100");
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
