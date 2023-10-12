import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Linear Equation Calculator!");

        System.out.print("Enter the first set of coordinates (e.g. (3,-7)): ");
        String input1 = scanner.nextLine();
        int x1 = Integer.parseInt(input1.substring(input1.indexOf("(") + 1, input1.indexOf(",")));
        int y1 = Integer.parseInt(input1.substring(input1.indexOf(",") + 1, input1.indexOf(")")));

        System.out.print("Enter the second set of coordinates (e.g. (4,5)): ");
        String input2 = scanner.nextLine();
        int x2 = Integer.parseInt(input2.substring(input2.indexOf("(") + 1, input2.indexOf(",")));
        int y2 = Integer.parseInt(input2.substring(input2.indexOf(",") + 1, input2.indexOf(")")));

        if (x1 == x2) {
            System.out.println("The points fall on a vertical line. Exiting.");
            return;
        }

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation);

        System.out.print("Would you like to enter an x value to get the corresponding y value? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the x value: ");
            double xValue = scanner.nextDouble();
            System.out.println("Coordinate: " + equation.getCoordinateForX(xValue));
        }

        System.out.println("Thank you for using the Linear Equation Calculator!");
    }
}
