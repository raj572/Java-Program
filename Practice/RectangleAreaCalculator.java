import java.util.Scanner;

class Rectangle {
    // Attributes
    double length;
    double width;

    // Constructor to initialize the attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create an instance of the Rectangle class using user input
        Rectangle rectangle = new Rectangle(length, width);

        // Calculate and display the area of the rectangle
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
