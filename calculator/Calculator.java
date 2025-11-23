import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("=== Simple Java Calculator ===");

        while (true) {
            System.out.print("Enter first number (or type 'q' to quit): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            System.out.print("Enter an operator (+, -, *, /, %): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case '%':
                    System.out.println("Result: " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, %.");
                    break;
            }

            System.out.println("-------------------------");
        }

        scanner.close();
    }
}
