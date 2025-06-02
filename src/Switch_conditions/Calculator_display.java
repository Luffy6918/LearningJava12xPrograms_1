package Switch_conditions;

import java.util.Scanner;

public class Calculator_display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            // Display menu
            System.out.println("\n====== Calculator Menu ======");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    // Subtraction
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    // Multiplication
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    // Division
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

