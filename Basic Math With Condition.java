// To read user's input
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter first number
        System.out.print("Please enter first number: ");
        double a = scanner.nextDouble();

        // prompt user to choose operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // prompt user to enter second number
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        double answer;

        // method
        if (operator == '+') {
            answer = a + b;
            System.out.println("The answer is: " + answer);
        } else if (operator == '-') {
            answer = a - b;
            System.out.println("The answer is: " + answer);
        } else if (operator == '*') {
            answer = a * b;
            System.out.println("The answer is: " + answer);
        } else if (operator == '/') {
            if (b != 0) {
                answer = a / b;
                System.out.println("The answer is: " + answer);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
