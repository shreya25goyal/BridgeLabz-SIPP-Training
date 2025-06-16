import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
  
        double first, second;
        String op;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

    
        for (int i = 1; i < 2; i++) {
          
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }

        scanner.close();
    }
}