import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob");
        while (true) {
            String input = sc.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine be that way.");
                break;
            } else {
                System.out.println("Whatever...");
            }
        }
    }
}
