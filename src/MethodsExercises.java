import java.math.BigInteger;
import java.util.Scanner;

public class MethodsExercises {
   public static void main(String[] args) {

      int j = 20;

      Scanner scanner = new Scanner(System.in);
      do {
//      part 1
      System.out.println(add(5,3));
      System.out.println(subtract(5,3));
      System.out.println(multiply(5,3));
      System.out.println(divide(5,3));
      System.out.println(modulus(5,3));
      System.out.println(multiplyWithLoop(5,3));
      System.out.println(multiplyWithRecursion(5,3));
      BigInteger factorialLoopResult = calcFactorialWithLoop(21);
         System.out.println("Using loop the factorial of the big integer 21 is " + factorialLoopResult);
      BigInteger factorialRecursionResult = calcFactorialWithRecursion (22);
         System.out.println("Using recursion the factorial of the big integer 22 is: " + factorialRecursionResult);
//      part 2 factorial with recursion
      System.out.print("Enter a number between 1 and " + j + ": ");
      int userInput = getInteger(1, j);
      System.out.println("User's number is: " + userInput);
      long factorialResult = calcFactorial(userInput);
      System.out.println("The factorial of " + userInput + " is " + factorialResult);

      System.out.print("Do you want to continue? (yes/no): ");
      } while (scanner.nextLine().equalsIgnoreCase("yes"));

      System.out.println("Thank you!");
      scanner.close();
   }
//   Basic Arithmetic
   public static int add (int num1, int num2) {
      return num1 + num2;
   }
   public static int subtract (int num1, int num2) {
      return num1 - num2;
   }
   public static int multiply (int num1, int num2) {
      return num1 * num2;
   }

   public static double divide (int num1, int num2) {
      if (num2 == 0) {
         throw new ArithmeticException("Cannot divide by zero");
      }
      return (double) num1 / num2;
   }

   public static int modulus (int num1, int num2) {
      if (num2 == 0) {
         throw new ArithmeticException("Cannot divide by zero");
      }
      return num1 % num2;
   }

   public static int multiplyWithLoop (int num1, int num2) {
      int result = 0;
      for (int i = 0; i < num2; i++) {
         result += num1;
      }
      return result;
   }

   public static int multiplyWithRecursion (int num1, int num2) {
      if (num2 <= 0) {
         return 0;
      } else {
      return num1 + multiplyWithRecursion(num1, num2-1);
      }
   }

//   Create a method that validates that user input is in a certain range and returns that input as an integer if it is
//   within the given range. If not, prompt the user to input their number again until the input is within range.
   public static int getInteger(int min, int max) {
      Scanner scanner = new Scanner(System.in);
      int userInput;

      while (true) {
         try {
            userInput = Integer.parseInt(scanner.nextLine());

            if (userInput >= min && userInput <= max) {
               break;
            } else {
               System.out.println("Please enter an integer between 1 and 20");
            }
         } catch(NumberFormatException e) {
               throw new RuntimeException(e);
            }
      }
      return userInput;
   }

   public static long calcFactorial (int num) {
      if (num == 0 || num == 1) {
         return 1;
      } else {
         return num * calcFactorial(num - 1);
      }
   }

   public static BigInteger calcFactorialWithRecursion (int num) {
      if (num == 0 || num == 1) {
         return BigInteger.ONE;
      } else {
         return BigInteger.valueOf(num).multiply(calcFactorialWithRecursion(num - 1));      }
   }

   public static BigInteger calcFactorialWithLoop (int num) {
      if (num < 0){
         throw new IllegalArgumentException("Can not find the factorial for negative numbers");
      }
      BigInteger result= BigInteger.ONE;
      for (int i = 1; i <= num; i++) {
         result = result.multiply(BigInteger.valueOf(i));
      }
      return result;
   }

}
