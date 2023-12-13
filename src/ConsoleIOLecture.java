import java.util.Scanner;

public class ConsoleIOLecture{
    public static void main(String[] args) {
//        System.out.println("I am a message!");
//        System.out.println("I'm on the next line.");

//        System.out.print("I am a message!");
//        System.out.print("I'm not on the next line.\n");
//        System.out.println("Do I show up on the same line?");

        String instructor = "David";
        int favoriteNum = 19;
        float pi = 3.14F;
        System.out.printf("Hello, my name is %s. and my favorite numbers are %d and %f."
                , instructor, favoriteNum, pi);
        System.out.println("\t This is a tab and show up on a new line due to ln");
        System.out.printf("Hello, my name is" + instructor +". and my favorite numbers are " + favoriteNum + " and " + pi +".");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}