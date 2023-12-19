import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. While loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i++);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 2. Do-while loop (even numbers)
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 3. Do-while loop (counting down by 5)
        j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 4. Do-while loop with long variable
        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 5. For loop (counting up)
        for (int l = 5; l <= 15; l++) {
            System.out.println(l);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 6. For loop (even numbers)
        for (int m = 0; m <= 100; m += 2) {
            System.out.println(m);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 7. For loop (counting down by 5)
        for (int m = 100; m >= -10; m -= 5) {
            System.out.println(m);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 8. For loop with long variable
        for (long n = 2; n < 1000000; n *= n) {
            System.out.println(n);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 9. FizzBuzz
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

//        10. Table of Powers
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Table or Powers\nPlease enter a number:");
            int userNum = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------- | ------- | -----");
            for (int num = 1; num <= userNum; num ++){
                System.out.printf("%-7d | %-7d | %d%n", num, num * num, num * num * num);
            }
            System.out.println("Would you like to see a table for another number?");
            String resp = scanner.next();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Restarting...");
        }

//        11. Convert to letter grade
        while (true) {
            System.out.println("Welcome to the Letter Grade\nPlease enter a numeric grade:");
            int userGrade = scanner.nextInt();
            System.out.print("That's a(n) ");
            if (userGrade >= 88) {
                System.out.println("A!");
            }
            else if (userGrade >= 80) {
                System.out.println("B!");
            }
            else if (userGrade >= 67) {
                System.out.println("C!");
            }
            else if (userGrade >= 60) {
                System.out.println("D!");
            }
            else {
                System.out.println("F!");
            }
            System.out.println("Would you like to convert your grade?");
            String resp = scanner.next();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Restarting...");
        }
    }
}
