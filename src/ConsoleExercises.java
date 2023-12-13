import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n",pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("User entered: " + num);

        System.out.print("Enter in 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("Word 1: %s%n", word1);
        System.out.printf("Word 2: %s%n", word2);
        System.out.printf("Word 3: %s%n", word3);

        System.out.print("Tell me a story: ");
        scanner.nextLine();
        String story = scanner.nextLine();
        System.out.println("Your story: \"" + story + "\"");

        System.out.println("What is the length of your room?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width of your room?");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length is %d.%n The width is %d%nThe perimeter is %d.%nThe are of the room is %d.%n"
                , length, width, (2 * length) + (2 * width), (length * width));

    }
}
