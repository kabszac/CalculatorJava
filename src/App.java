import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter calculation (e.g 6 + 5): ");
        double num1 = scanner.nextDouble();
        String operator = scanner.next();
        double num2 = scanner.nextDouble();

        try {
            double result = calculator.calculate(num1, operator, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}