package task1;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of operation would you like to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        try {
            int choice = scanner.nextInt();
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();
            switch (choice) {
                case 1:
                    int sum = calculator.add(number1, number2);
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    int difference = calculator.subtract(number1, number2);
                    System.out.println("Difference: " + difference);
                    break;
                case 3:
                    int product = calculator.multiply(number1, number2);
                    System.out.println("Product: " + product);
                    break;
                case 4:
                    double quotient = calculator.divide(number1, number2);
                    System.out.println("Quotient: " + quotient);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException err) {
            System.out.println("Sorry, you must enter an integer.");
        } catch (Exception err2) {
            System.out.println(err2.getMessage());
        }

        scanner.close();
    }

}