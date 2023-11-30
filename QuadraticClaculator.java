import java.util.Scanner;
//CSC/20U/4105
//CSC/20D/4108
//CSC/20U/4041
//CSC/20U/4077
//CSC/20D/4120

public class QuadraticClaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the value of a: ");
        double a = validateDoubleInput(scanner);

        System.out.print("Enter the value of b: ");
        double b = validateDoubleInput(scanner);

        System.out.print("Enter the value of c: ");
        double c = validateDoubleInput(scanner);

        // Check for divide by zero or negative discriminant
        if (a == 0) {
            System.out.println("Invalid input: 'a' cannot be zero.");
            return;
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots exist.");
            return;
        }

        // Calculate and display the root
        double root = quadratic(a, b, c);
        System.out.println("Root of the quadratic equation: " + root);
    }

    public static double quadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(discriminant);

        double root1 = (-b + sqrtDiscriminant) / (2 * a);
        double root2 = (-b - sqrtDiscriminant) / (2 * a);

        // Return root2 if you want the second root
        return root1;
    }

    public static double validateDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}